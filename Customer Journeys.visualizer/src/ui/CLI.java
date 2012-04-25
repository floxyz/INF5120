package ui;

import logic.Visualizer;

public class CLI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Visualizer visualizer = new Visualizer("../instances/exampleSet.journeymodel");
		visualizer.dump();

	}

}
