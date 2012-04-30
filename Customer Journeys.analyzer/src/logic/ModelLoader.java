package logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import journeymodel.JourneySet;
import journeymodel.impl.JourneymodelPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import renderer.Website;

public class ModelLoader {

	private Resource resource;
	private EObject resourceContent;

	public ModelLoader(String filename) {
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

	public JourneySet getJourneySet(){
		if (resourceContent instanceof JourneySet)
			return (JourneySet) resourceContent;
		else return null;
	}
	
	/**
	 * Prints the loaded file to standard output.
	 */
	public void dump() {
		if (resourceContent instanceof JourneySet) {
			JourneySet set = (JourneySet) resourceContent;
			System.out.print(set.toMarkdown());
		} else {
			System.err.print("Not a valid model class!");
		}
	}

	public void makeWebsite(String filename) throws IOException {
		if (resourceContent instanceof JourneySet){
			Website generator = new Website((JourneySet) resourceContent);
			generator.make(filename);
		}
	}

}
