package renderer;

import java.io.*;
import java.util.*;

import com.petebevin.markdown.MarkdownProcessor;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import journeymodel.Journey;
import journeymodel.JourneySet;
import logic.Visualizer;

public class Website {

	private JourneySet set;

	
	
	public Website(JourneySet set){
		this.set = set;
	}
	
	public void make(String filename){
		HashMap<String, Object> model = new HashMap<String, Object>();

		// layout and js lib things
		model.put("css_bootstrap", getResource("/resources/bootstrap/css/bootstrap.min.css"));
		model.put("css_bootstrap_resp", getResource("/resources/bootstrap/css/bootstrap-responsive.min.css"));
		model.put("css_custom", getResource("/resources/css/custom.css"));
		model.put("js_jquery", getResource("/resources/js/jquery.min.js"));
		model.put("js_bootstrap", getResource("/resources/bootstrap/js/bootstrap.min.js"));
		model.put("js_custom",  getResource("/resources/js/custom.coffee"));
		model.put("js_coffee", getResource("/resources/js/coffee-script.js"));
		model.put("m", new MarkdownProcessor());
		// the real deal
		model.put("set", this.set);
		model.put("journeys", this.set.getJourneys());

		HashMap<String, String> graphs = new HashMap<String, String>();		
		for(Journey j: set.getJourneys()){
			graphs.put(j.getID(), this.getSvgGraph(this.set, j));
		}
		graphs.put("_set", this.getSvgGraph(set, null));
		model.put("graphs", graphs);
		
		// render and save the stuff
		try {
			FileWriter fstream = new FileWriter(filename);
			BufferedWriter out = new BufferedWriter(fstream);
			Configuration cfg = new Configuration();
			// FIXME, TODO: get the right path!
			cfg.setTemplateLoader(new FileTemplateLoader(new File("src/resources")));
			Template tpl = cfg.getTemplate("index.html");
			tpl.process(model, out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("TPL Error: " + e.getMessage());
		}
		
		
	}

	private String getSvgGraph(JourneySet set, Journey j){
		try {
			if(j == null){
				return Visualizer.graphvizToSvg(set.getGraphviz());
			} else {
				return Visualizer.graphvizToSvg(set.getGraphviz(j));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
		
	private String getResource(String name){
		System.out.println("Loading resource: " + name);
		return Website.readTextFile(String.class, name);
	}
	
	public static <T> String readTextFile(Class<T> clazz, String resourceName){
	  	StringBuffer sb = new StringBuffer(1024);
		BufferedInputStream inStream = new BufferedInputStream(clazz.getResourceAsStream(resourceName));
	  	byte[] chars = new byte[1024];
	  	int bytesRead = 0;
	  	try {
			while( (bytesRead = inStream.read(chars)) > -1){
				//System.out.println(bytesRead);
				sb.append(new String(chars, 0, bytesRead));
			}
		  	inStream.close();
	    	return sb.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
