package ui;

import logic.Analyzer;

public class CLI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Analyzer analyzer = new Analyzer("../instances/some.customerjourney");
		analyzer.printJourney();
		
	}

}