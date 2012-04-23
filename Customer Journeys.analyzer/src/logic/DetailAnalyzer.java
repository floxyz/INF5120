package logic;

import java.util.List;

import journeymodel.EChannel;
import journeymodel.EEvaluation;
import journeymodel.Journey;
import journeymodel.JourneyDiff;
import journeymodel.JourneySet;
import journeymodel.Touchpoint;
import logic.interfaces.IDetailAnalyzer;

/**
 * The implementation of the interface {@link IDetailAnalyzer}.
 * 
 * @author Florian Hagenauer
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
			builder.append(generateJourneyStatistics(journey));
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

	private String generateJourneyStatistics(Journey journey) {
		StringBuilder builder = new StringBuilder();
		builder.append("####################\nDetail Statistics for journey " + journey.getName() + " (" + journey.getID() + ")\n");
		builder.append(this.getRatingStatistics(journey));
		builder.append(this.getChannelStatistics(journey));
		builder.append(this.getCompareToExpected(journey));
		return builder.append("####################\n\n").toString();
	}

	private String getRatingStatistics(Journey journey) {
		Integer totalRatings = journey.getTouchpoints().size();
		StringBuilder builder = new StringBuilder("----------\nRating Statistics for a total number of " + totalRatings + " ratings:\n");

		Integer goodRatingCount = this.getRatingCount(journey, EEvaluation.GOOD);
		builder.append("Good Ratings: " + goodRatingCount + " (" + ((float) (goodRatingCount) / (float) (totalRatings)) + "%)\n");
		Integer badRatingCount = this.getRatingCount(journey, EEvaluation.BAD);
		builder.append("Bad Ratings: " + badRatingCount + " (" + ((float) (badRatingCount) / (float) (totalRatings)) + "%)\n");
		Integer mediumRatingCount = this.getRatingCount(journey, EEvaluation.MEDIUM);
		builder.append("Medium Ratings: " + mediumRatingCount + " ("
				+ ((float) (mediumRatingCount) / (float) (journey.getTouchpoints().size())) + "%)\n");
		Integer naRatingCount = this.getRatingCount(journey, EEvaluation.NOT_AVAILABLE);
		builder.append("Na Ratings: " + naRatingCount + " (" + ((float) (naRatingCount) / (float) (totalRatings)) + "%)\n");
		Integer emptyRatingCount = this.getRatingCount(journey, EEvaluation.EMPTY);
		builder.append("Empty Ratings: " + emptyRatingCount + " (" + ((float) (emptyRatingCount) / (float) (totalRatings)) + "%)\n");

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
		StringBuilder builder = new StringBuilder("----------\nChannel Statistics for  " + channelList.size() + " channels:\n");

		for (EChannel channel : channelList) {
			builder.append(this.getSingleChannelStatistic(journey, channel));
		}
		return builder.toString();
	}

	private String getSingleChannelStatistic(Journey journey, EChannel channel) {
		Integer channelCount = 0;
		for (Touchpoint touchpoint : journey.getTouchpoints()) {
			if (touchpoint.getChannel() == channel) {
				channelCount++;
			}
		}
		return (channel.toString() + ": " + channelCount + " (" + ((float) channelCount / (float) journey.getTouchpoints().size()) + "%)\n");
	}
	
	private String getCompareToExpected(Journey journey) {
		JourneyDiff diff = journeySet.getExpectedJoruney().compare(journey);
		StringBuilder builder = new StringBuilder("----------\nCompare to Expected Journey:\n");
		builder.append("Common touchpoints: " + diff.getCommonTP() + "\n");
		builder.append("New touchpoints:    " + diff.getNewTP() + "\n");
		builder.append("Unused touchpoints: " + diff.getUnusedTP() + "\n");
		return builder.toString();
	}
	
}