package renderer;

import com.petebevin.markdown.MarkdownProcessor;

import journeymodel.JourneySet;

public class Website {

	private JourneySet set;

	
	
	public Website(JourneySet set){
		this.set = set;
	}
	
	public String getHtml(){
		MarkdownProcessor m = new MarkdownProcessor();
		StringBuilder builder = new StringBuilder();
		builder.append("<!doctype html>"
		+ "<html lang='en'>"
		+ "<head>"
		+  "<meta charset='utf-8'>"
		+  "<title>The HTML5 Herald</title>"
		+  "<meta name='description' content='Customerjourney Analysis'>"
		+  "<title>" + ((set.getName() == null) ? "" : set.getName()) + "</title>"
		+ "</head>"
		+ "<body>"
		+ m.markdown("# Foo Bar\n\n * Foo\n * Bar\n * Baz")
		+ "</body>"
		+ "</html>");
		return builder.toString();
	}


}
