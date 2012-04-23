package logic;

import java.util.List;

import journeymodel.EEvaluation;
import journeymodel.Journey;
import journeymodel.JourneySet;
import journeymodel.Touchpoint;
import logic.interfaces.IDetailAnalyzer;

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
		builder.append("Detail Statistics for journey " + journey.getName() + " (" + journey.getID() + ")\n");

		Integer totalRatings = journey.getTouchpoints().size();

		builder.append("Rating Statistics for a total number of " + totalRatings + " ratings:\n");
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

		builder.append("\n");
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

}
