package ui;

import java.io.IOException;

import logic.Analyzer;

public class CLI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Analyzer analyzer = new Analyzer("../instances/exampleSet.journeymodel");
		//analyzer.dump();
		try {
			analyzer.makeWebsite("output.html");
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
