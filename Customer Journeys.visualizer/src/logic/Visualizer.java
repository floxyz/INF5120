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
			
			GraphVizAPI gvApi = new GraphVizAPI();
			String type = "svg";
			gvApi.getGraph(set.getGraphviz(), type);
			File out = new File("graphSet." + type);
			gvApi.writeGraphToFile( gvApi.getGraph( set.getGraphviz(), type ), out );
			
			Journey expected = set.getExpectedJoruney();
			for (Journey journey: set.getJourneys()) {
				if (journey == expected) continue;
				
				StringBuilder builder = new StringBuilder("strict digraph " + journey.getID() + " {\n");
				builder.append("rankdir=LR;\n");
				builder.append("edge [color=slategrey]\n");
				
//				builder.append("edge [color=blue]\n");
//				builder.append("T0 -> T1 -> T2 -> T3;\n");
//				builder.append("edge [color=darkslategrey]\n");
				builder.append(expected.getGraphviz(false, journey.getEdges()));
//				builder.append("edge [color=darkorange];\n");
				builder.append(journey.getGraphviz(true, null));
				
				builder.append("}\n"); //close JourneySet
				
				File out2 = new File("graph" + journey.getID() + "." + type);
				gvApi.writeGraphToFile( gvApi.getGraph( builder.toString(), type ), out2 );
				
				System.out.println(builder.toString());
			}
			
			
			//System.out.println(set.getGraphviz());
		}
	}
	
}
