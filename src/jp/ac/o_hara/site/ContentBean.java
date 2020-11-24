package jp.ac.o_hara.site;
import java.io.Serializable;

public class ContentBean implements Serializable {
	private String content = "";
	
	public ContentBean() {}
	public ContentBean(String content) {
		this.content = content;
	}
	
	public void setContent(String content) { this.content = content; }
	public String getContent() { return this.content; }
}