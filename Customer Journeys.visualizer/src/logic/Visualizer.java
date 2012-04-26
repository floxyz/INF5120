package logic;

import java.io.File;

import journeymodel.Journey;
import journeymodel.JourneySet;
import journeymodel.Touchpoint;
import journeymodel.impl.JourneymodelPackageImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Visualizer {

	private Resource resource;
	private EObject resourceContent;

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
	 */
	public void dump() {
		// get model elements from the resource
		if (resourceContent instanceof Journey) {
			Journey journey = (Journey) resourceContent;
		} else if (resourceContent instanceof JourneySet) {
			JourneySet set = (JourneySet) resourceContent;
			System.out.println(getGraphviz(set));
		}
	}
	
	private String getGraphviz(JourneySet set) {
		StringBuilder builder = new StringBuilder("strict digraph JourneySet {\n");
		
		Journey expected = set.getExpectedJoruney();
		builder.append(getGraphviz(expected));
		for (Journey journey: set.getJourneys()) {
			if (journey == expected) continue;
			builder.append(getGraphviz(journey));
		}
		
		builder.append("}\n"); //close JourneySet
		
		return builder.toString();
	}

	private String getGraphviz(Journey journey) { //expected
		StringBuilder builder = new StringBuilder();
		builder.append("subgraph cluster_" + journey.getID() +" {\n");
		builder.append("label = \"" + journey.getID() + "\"\n");
		
		boolean first = true;
		for (Touchpoint tp: journey.getTouchpoints()) {
			if (first)
				first = false;
			else
				builder.append(" -> ");
			builder.append(tp.getID());
		}
		builder.append(";\n");
		builder.append("}\n"); //close Subgraph
		
		EList<Touchpoint> touchpoints = journey.getTouchpoints();
		Touchpoint start = touchpoints.get(0);
		Touchpoint end = touchpoints.get(touchpoints.size() - 1);
		builder.append("start -> " + start.getID() + ";\n");
		builder.append(end.getID() + " -> end;\n");
		
		return builder.toString();
	}
}
