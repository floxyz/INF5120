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
				builder.append(generateJourneyStatistics(journey, journeySet.getExpectedJoruney()));
			}
		}
		return builder.append("\n").toString();
	}

	
	@Override
	public String getGlobalStatistics() {
		StringBuilder builder = new StringBuilder();
		builder.append("# Global Statistics for " + journeySet.getName() + ":\n\n");
		builder.append(journeySet.getGlobalComparedToExpected());
		return builder.append("\n\n").toString();
	}

	private String generateJourneyStatistics(Journey journey, Journey expected) {
		StringBuilder builder = new StringBuilder();
		builder.append("# Detail Statistics for journey " + journey.getName() + " (" + journey.getID() + ")\n\n");
		builder.append(journey.getRatingStatistics());
		builder.append(journey.getChannelStatistics());
		builder.append(journey.getInitiatorStatistics());
		builder.append(journey.getComparedToExpected(expected));
		return builder.append("\n\n").toString();
	}
}
