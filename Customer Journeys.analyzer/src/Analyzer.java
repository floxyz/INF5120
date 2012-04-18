import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import customerjourney.*;
import customerjourney.impl.*;
import customerjourney.util.*;

public class Analyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		// You find the correct name of the package in the generated model code
		CustomerjourneyPackage libraryPackage = CustomerjourneyPackage.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File("../instances/some.customerjourney").getAbsolutePath());

		// Demand load the resource for this file, here the actual loading is done.
		Resource resource = resourceSet.getResource(fileURI, true);

		// get model elements from the resource
		EObject myModelObject = resource.getContents().get(0); // get(0) might be dangerous. why?

		// Do something with the model
		if(myModelObject instanceof CustomerJourney){ // Model is the root class of your model
			CustomerJourney cj = (CustomerJourney) myModelObject;
			for (Touchpoint tp: (List<Touchpoint>) cj.getTouchpoints()){
				System.out.println(tp.getName());
			}
		}
	}

}
