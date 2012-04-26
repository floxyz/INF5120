package logic;

import java.util.List;

import journeymodel.EChannel;
import journeymodel.EEvaluation;
import journeymodel.EInitiator;
import journeymodel.Journey;
import journeymodel.JourneyDiff;
import journeymodel.JourneySet;
import journeymodel.Touchpoint;
import logic.interfaces.IDetailAnalyzer;

/**
 * The implementation of the interface {@link IDetailAnalyzer}.
 * 
 * @author Florian Hagenauer, modified by Kacper Surdy
 * 
 */
public class DetailAnalyzer implements IDetailAnalyzer {

	private JourneySet journeySet;

	public DetailAnalyzer(JourneySet journeySet) {
		this.journeySet = journeySet;
	}

	@Override
	public String getDetailSetStatistic() {
		StringBuilder builder = new StringBuilder();
		for (Journey journey : this.journeySet.getJourneys()) {
			if (!journey.getID().equalsIgnoreCase("reference")) {
				builder.append(generateJourneyStatistics(journey));
			}
		}
		return builder.append("\n").toString();
	}

	@Override
	public String getDetailJourneyStatistic(String ID) {
		List<Journey> journeys = this.journeySet.getJourneys();
		for (Journey journey : journeys) {
			if (journey.getID().equalsIgnoreCase(ID)) { // TODO or only equals?
				return this.generateJourneyStatistics(journey);
			}
		}
		return "";
	}
	
	@Override
	public String getGlobalStatistics() {
		StringBuilder builder = new StringBuilder();
		builder.append("# Global Statistics for " + journeySet.getName() + ":\n\n");
		builder.append(getGlobalComparedToExpected());
		return builder.append("\n\n").toString();
	}

	private String generateJourneyStatistics(Journey journey) {
		StringBuilder builder = new StringBuilder();
		builder.append("# Detail Statistics for journey " + journey.getName() + " (" + journey.getID() + ")\n\n");
		builder.append(this.getRatingStatistics(journey));
		builder.append(this.getChannelStatistics(journey));
		builder.append(this.getInitiatorStatistics(journey));
		builder.append(this.getComparedToExpected(journey));
		return builder.append("\n\n").toString();
	}

	private String getRatingStatistics(Journey journey) {
		Integer totalRatings = journey.getTouchpoints().size();
		StringBuilder builder = new StringBuilder("## Rating Statistics for a total number of " + totalRatings + " ratings:\n\n");

		Integer goodRatingCount = this.getRatingCount(journey, EEvaluation.GOOD);
		builder.append("* Good Ratings: " + goodRatingCount + " (" + ((float) (goodRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		Integer badRatingCount = this.getRatingCount(journey, EEvaluation.BAD);
		builder.append("* Bad Ratings: " + badRatingCount + " (" + ((float) (badRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		Integer mediumRatingCount = this.getRatingCount(journey, EEvaluation.MEDIUM);
		builder.append("* Medium Ratings: " + mediumRatingCount + " ("
				+ ((float) (mediumRatingCount) / (float) (journey.getTouchpoints().size())) * 100 + "%)\n");
		Integer naRatingCount = this.getRatingCount(journey, EEvaluation.NOT_AVAILABLE);
		builder.append("* Na Ratings: " + naRatingCount + " (" + ((float) (naRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		Integer emptyRatingCount = this.getRatingCount(journey, EEvaluation.EMPTY);
		builder.append("* Empty Ratings: " + emptyRatingCount + " (" + ((float) (emptyRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		builder.append("\n\n");
		return builder.toString();
	}

	private Integer getRatingCount(Journey journey, EEvaluation rating) {
		Integer counter = 0;
		List<Touchpoint> touchpointList = journey.getTouchpoints();
		for (Touchpoint touchpoint : touchpointList) {
			if (touchpoint.getEvaluation() == rating) {
				counter++;
			}
		}
		return counter;
	}

	private String getChannelStatistics(Journey journey) {
		List<EChannel> channelList = EChannel.VALUES;
		StringBuilder builder = new StringBuilder("## Channel Statistics for  " + channelList.size() + " channels:\n\n");

		for (EChannel channel : channelList) {
			builder.append(this.getSingleChannelStatistic(journey, channel));
		}
		builder.append("\n\n");
		return builder.toString();
	}

	private String getSingleChannelStatistic(Journey journey, EChannel channel) {
		Integer channelCount = 0;
		for (Touchpoint touchpoint : journey.getTouchpoints()) {
			if (touchpoint.getChannel() == channel) {
				channelCount++;
			}
		}
		return ("* " + channel.toString() + ": " + channelCount + " (" + ((float) channelCount / (float) journey.getTouchpoints().size())
				* 100 + "%)\n");
	}

	private String getInitiatorStatistics(Journey journey) {
		List<EInitiator> initiatorList = EInitiator.VALUES;
		StringBuilder builder = new StringBuilder("## Initiator Statistics for  " + initiatorList.size() + " initiators:\n\n");

		for (EInitiator initiator : initiatorList) {
			builder.append(this.getSingleInitiatorStatistic(journey, initiator));
		}
		builder.append("\n\n");
		return builder.toString();
	}

	private String getSingleInitiatorStatistic(Journey journey, EInitiator initiator) {
		Integer initiatorCount = 0;
		for (Touchpoint touchpoint : journey.getTouchpoints()) {
			if (touchpoint.getInitiator() == initiator) {
				initiatorCount++;
			}
		}
		return ("* " + initiator.toString() + ": " + initiatorCount + " ("
				+ ((float) initiatorCount / (float) journey.getTouchpoints().size()) * 100 + "%)\n");
	}

	private String getComparedToExpected(Journey journey) {
		if (journeySet.getExpectedJoruney() == null)
			return "## No Expected Journey to compare with\n\n";
		JourneyDiff diff = journeySet.getExpectedJoruney().compare(journey);
		StringBuilder builder = new StringBuilder("## Compared to the Expected Journey:\n");
		builder.append("* Common touchpoints: " + diff.getCommonTP() + "\n");
		builder.append("* New touchpoints:    " + diff.getNewTP() + "\n");
		builder.append("* Unused touchpoints: " + diff.getUnusedTP() + "\n");
		builder.append("\n\n");
		return builder.toString();
	}
	
	private String getGlobalComparedToExpected() {
		Journey expected = journeySet.getExpectedJoruney();
		if (expected == null)
			return "## No Expected Journey to compare with\n";
		int total = 0, common = 0, newtp = 0, unused = 0,
				minCommon = Integer.MAX_VALUE, maxCommon = Integer.MIN_VALUE,
				minNew = Integer.MAX_VALUE, maxNew = Integer.MIN_VALUE,
				minUnused = Integer.MAX_VALUE, maxUnused = Integer.MIN_VALUE;
		
		for (Journey journey: journeySet.getJourneys()) {
			if (journey == expected) continue;
			
			JourneyDiff diff = expected.compare(journey);
			++total;
			
			common += diff.getCommonTP();
			newtp += diff.getNewTP();
			unused += diff.getUnusedTP();
			
			minCommon = minCommon < diff.getCommonTP() ? minCommon : diff.getCommonTP();
			minNew = minNew < diff.getNewTP() ? minNew : diff.getNewTP();
			minUnused = minUnused < diff.getUnusedTP() ? minUnused : diff.getUnusedTP();
			
			maxCommon = maxCommon > diff.getCommonTP() ? maxCommon : diff.getCommonTP();
			maxNew = maxNew > diff.getNewTP() ? maxNew : diff.getNewTP();
			maxUnused = maxUnused > diff.getUnusedTP() ? maxUnused : diff.getUnusedTP();
		}
		
		StringBuilder builder = new StringBuilder("## Customer journeys compared to the Expected Journey:\n");
		builder.append("\n### Common touchpoints:\n");
		builder.append("* Avarage: " + (float) common / (float) total + "\n");
		builder.append("* Min: " + minCommon + "\n");
		builder.append("* Max: " + maxCommon + "\n");
		builder.append("\n### New touchpoints:\n");
		builder.append("* Avarage: " + (float) newtp / (float) total + "\n");
		builder.append("* Min: " + minNew + "\n");
		builder.append("* Max: " + maxNew + "\n");
		builder.append("\n### Unused touchpoints:\n");
		builder.append("* Avarage: " + (float) unused / (float) total + "\n");
		builder.append("* Min: " + minUnused + "\n");
		builder.append("* Max: " + maxUnused + "\n");
		return builder.toString();
	}
}
