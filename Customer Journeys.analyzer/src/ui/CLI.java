package ui;

import java.io.IOException;
import com.martiansoftware.jsap.*;

import logic.ModelLoader;

public class CLI {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		JSAP jsap = new JSAP();
		
		FlaggedOption fileOption = new FlaggedOption("filename")
									.setStringParser(JSAP.STRING_PARSER)
									.setRequired(true)
									.setShortFlag('f')
									.setLongFlag("file");
		fileOption.setHelp("The journey set to analyze");
		jsap.registerParameter(fileOption);
		
		JSAPResult config = jsap.parse(args);
		
		if (!config.success()){
			System.err.println();
			for(java.util.Iterator errs = config.getErrorMessageIterator(); errs.hasNext();){
				System.err.println("Error: " + errs.next());
			}
			System.err.println();
			//System.err.println(jsap.getUsage());
			System.err.println(jsap.getHelp());
			System.exit(1);
		}
		
		ModelLoader modelLoader = new ModelLoader(config.getString("filename"));
		
		
		try {
			modelLoader.makeWebsite("output.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
