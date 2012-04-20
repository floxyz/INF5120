package logic;
import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import journeymodel.*;
import journeymodel.impl.JourneymodelPackageImpl;

public class Analyzer {

	private Resource resource;
	
	public Analyzer(String filename){
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory and init the package!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		JourneymodelPackageImpl.init();
		
		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(filename).getAbsolutePath());

		// Demand load the resource for this file, here the actual loading is done.
		resource = resourceSet.getResource(fileURI, true);		
	}
	
	/**
	 * Print one journey to stdout.
	 * TODO: Maybe implement this directly in the generated model as toString?
	 * @param journey
	 */
	private void printJourney(Journey journey){
		System.out.println("  customer journey " + journey.getName());
		System.out.println("    from: " + journey.getDate());
		System.out.println("    status: " + journey.getStatus());
		System.out.println("    commnt: " + journey.getComment());
		System.out.println("    touchpoints:");
		for (Touchpoint tp: (List<Touchpoint>) journey.getTouchpoints()){
			System.out.println("      " + tp.getID() + " " + tp.getName() + " (" + tp.getEvaluation()+ ")");
		}
	}
	
	private void printJourneySet(JourneySet set){
		System.out.println("journey set:" + set.getName());
		for (Journey j: (List<Journey>) set.getJourneys()){
			printJourney(j);
		}
	}
	
	/**
	 * Prints the loaded file to stdout.
	 */
	public void dump(){
		// get model elements from the resource
		EObject resourceContent = resource.getContents().get(0); // get(0) might be dangerous. why?

		// Do something with the model
		if(resourceContent instanceof Journey){
			Journey journey = (Journey) resourceContent;
			printJourney(journey);
		} else if (resourceContent instanceof JourneySet){
			JourneySet set = (JourneySet) resourceContent;
			printJourneySet(set);
		}
	}
	
	
}
