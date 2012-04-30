package ui;

import java.io.IOException;

import logic.Visualizer;

public class CLI {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		Visualizer visualizer = new Visualizer("../instances/exampleSet.journeymodel");
		visualizer.dump();

	}

}
