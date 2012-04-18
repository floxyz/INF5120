package logic;
import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import customerjourney.*;

public class Analyzer {

	private Resource resource;
	
	public Analyzer(String filename){
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory and init the package!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		customerjourney.impl.CustomerjourneyPackageImpl.init();
		
		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(filename).getAbsolutePath());

		// Demand load the resource for this file, here the actual loading is done.
		resource = resourceSet.getResource(fileURI, true);		
	}
	
	public void printJourney(){
		// get model elements from the resource
		EObject resourceContent = resource.getContents().get(0); // get(0) might be dangerous. why?

		// Do something with the model
		if(resourceContent instanceof CustomerJourney){ // Model is the root class of your model
			CustomerJourney journey = (CustomerJourney) resourceContent;
			System.out.println("Journey: " + journey.getName());
			for (Touchpoint tp: (List<Touchpoint>) journey.getTouchpoints()){
				System.out.println(" - " + tp.getName());
			}
		}
	}
}
