package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import journeymodel.Journey;
import journeymodel.JourneySet;
import journeymodel.impl.JourneymodelPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Visualizer {

	private Resource resource;
	private EObject resourceContent;
	
	private static String DOT = "dot";	// Assuming it's in the system path

	public Visualizer(String filename) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory and init the package!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		JourneymodelPackageImpl.init();

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(filename).getAbsolutePath());

		// Demand load the resource for this file, here the actual loading is
		// done.
		resource = resourceSet.getResource(fileURI, true);
		resourceContent = resource.getContents().get(0);

	}

	/**
	 * Prints the loaded file to standard output.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void dump() throws IOException, InterruptedException {
		// get model elements from the resource
		if (resourceContent instanceof Journey) {
			Journey journey = (Journey) resourceContent;
		} else if (resourceContent instanceof JourneySet) {
			JourneySet set = (JourneySet) resourceContent;
			
			PrintWriter out = new PrintWriter(new FileOutputStream("graphSet.svg"));
			out.write(graphvizToSvg( set.getGraphviz() ));
			out.close();
			
			Journey expected = set.getExpectedJoruney();
			for (Journey journey: set.getJourneys()) {
				if (journey == expected) continue;
				
				out = new PrintWriter(new FileOutputStream("graph" + journey.getID() + ".svg"));
				out.write(graphvizToSvg( set.getGraphviz(journey) ));
				out.close();
			}
			
		}
	}
	
	/*
	 * Toabi, this should be useful for you :)
	 * It returns graph in SVG format. Take a look at dump() for example usage.
	 */
	private String graphvizToSvg(String graph) throws IOException, InterruptedException {
		//Execute dot process
		Runtime runTime = Runtime.getRuntime();
		String[] args = {DOT, "-Tsvg"};
		Process process = runTime.exec(args);

		//Write input
		PrintWriter writer = new PrintWriter(process.getOutputStream());
		writer.write(graph);
		writer.close();
		
		//Get output
		InputStream in = process.getInputStream();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    	StringBuilder builder = new StringBuilder();
    	String line;
    	while ((line = reader.readLine()) != null) {
    		builder.append(line);
    	}
    	reader.close();
    	
    	process.waitFor();
    	
    	return builder.toString();
	}
	
}
