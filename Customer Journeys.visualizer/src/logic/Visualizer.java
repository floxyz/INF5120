package logic;

import java.io.File;

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
		}
	}

}
