package renderer;

import java.io.*;

import com.petebevin.markdown.MarkdownProcessor;

import journeymodel.JourneySet;
import logic.DetailAnalyzer;

public class Website {

	private JourneySet set;

	
	
	public Website(JourneySet set){
		this.set = set;
	}
	
	public String getHtml(){
		MarkdownProcessor m = new MarkdownProcessor();
		StringBuilder builder = new StringBuilder();
		DetailAnalyzer analyzer = new DetailAnalyzer(set);
		builder.append("<!DOCTYPE html>"
		+ "<html lang='en'>"
		+ "<head>"
		+  "<meta charset='utf-8'>"
		+  "<meta name='description' content='Customerjourney Analysis'>"
		+  "<title>Customer Journey Analysis: " + ((set.getName() == null) ? "" : set.getName()) + "</title>"
		+  "<style type='text/css'>"
		+     getResource("/resources/bootstrap/css/bootstrap.min.css")
		+  "</style>"
		+ "</head>"
		+ "<body>"
		+ "<div class='navbar navbar-fixed-top'>"
		+   "<div class='navbar-inner'>"
		+      "<div class='container'>"
		+        "<a class='brand' href='#'>CJAnalyzer</a>"
		+      "</div>"
		+   "</div>"
		+ "</div>"
		+ "<div class='container'>"
		+ m.markdown(analyzer.getDetailSetStatistic())
		+ "<br >"
		+ "<pre id='markdown-source'>" + analyzer.getDetailSetStatistic() + "</pre>"
		+ "<a href='#' class='btn' id='toggle-source'>toggle markdown source</a>"
		+ "</div>"
		+  "<script type='text/javascript'>" + getResource("/resources/js/jquery.min.js") + "</script>"
		+  "<script type='text/javascript'>" + getResource("/resources/bootstrap/js/bootstrap.min.js") + "</script>"
		+  "<script type='text/coffeescript'>" + getResource("/resources/js/custom.coffee") + "</script>"
		+  "<script type='text/javascript'>" + getResource("/resources/js/coffee-script.js") + "</script>"
		+ "</body>"
		+ "</html>");
		return builder.toString();
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
