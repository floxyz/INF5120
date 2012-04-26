package logic.interfaces;

/**
 * This interface should be implemented by classes who offer details statistics
 * about a customer journey. When initialized the Detail Analyzer should get a
 * complete Customer Journey.
 * 
 * @author Florian Hagenauer
 * 
 */

public interface IDetailAnalyzer {

	/**
	 * This method returns a String with the detailed statistics of the the
	 * complete customer journey.
	 * 
	 * @return A String with statistics
	 */
	String getDetailSetStatistic();

	/**
	 * This method returns a String with the global statistics of the the
	 * customer journey set.
	 * 
	 * @return A String with statistics
	 */
	String getGlobalStatistics();
}
