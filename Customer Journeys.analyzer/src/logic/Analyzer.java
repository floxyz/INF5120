package logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import journeymodel.Journey;
import journeymodel.JourneySet;
import journeymodel.Touchpoint;
import journeymodel.impl.JourneymodelPackageImpl;
import logic.interfaces.IDetailAnalyzer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import renderer.Website;

public class Analyzer {

	private Resource resource;
	private EObject resourceContent;

	public Analyzer(String filename) {
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
	 * Print one journey to standard output. TODO: Maybe implement this directly
	 * in the generated model as toString?
	 * 
	 * @param journey
	 */
	private void printJourney(Journey journey) {
		System.out.println("\n##  customer journey " + journey.getName() + '\n');
		System.out.println("*    from: " + journey.getDate());
		System.out.println("*    status: " + journey.getStatus());
		System.out.println("*    commnt: " + journey.getComment());
		System.out.println("\n###    touchpoints:");
		int i = 0;
		for (Touchpoint tp : (List<Touchpoint>) journey.getTouchpoints()) {
			i++;
			System.out.println(i + ".     " + tp.getID() + " " + tp.getName() + " (" + tp.getEvaluation() + ")");
		}
		System.out.println();
	}

	private void printJourneySet(JourneySet set) {
		if (set.getExpectedJoruney() != null) {
			System.out.println("\n# Expected journey:\n");
			printJourney(set.getExpectedJoruney());
		} else {
			System.out.println("**No expected journey available.**");
		}

		System.out.println("\n# Set name: " + set.getName());
		for (Journey j : (List<Journey>) set.getJourneys()) {
			if (!j.getID().equalsIgnoreCase("reference")) {
				printJourney(j);
			}
		}
		IDetailAnalyzer analyzer = new DetailAnalyzer(set);
		System.out.println(analyzer.getGlobalStatistics());
		System.out.println(analyzer.getDetailSetStatistic());
	}

	/**
	 * Prints the loaded file to standard output.
	 */
	public void dump() {
		// get model elements from the resource
		if (resourceContent instanceof Journey) {
			Journey journey = (Journey) resourceContent;
			printJourney(journey);
		} else if (resourceContent instanceof JourneySet) {
			JourneySet set = (JourneySet) resourceContent;
			printJourneySet(set);
		}
	}

	public void makeWebsite(String filename) throws IOException {
		if (resourceContent instanceof JourneySet){
			Website generator = new Website((JourneySet) resourceContent);
			FileWriter fstream = new FileWriter(filename);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(generator.getHtml());
			out.close();
		}
	}

}
