package ui;

import java.io.IOException;

import logic.ModelLoader;

public class CLI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ModelLoader modelLoader = new ModelLoader("../instances/exampleSet.journeymodel");
		try {
			modelLoader.makeWebsite("output.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
