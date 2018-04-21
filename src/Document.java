import java.util.Scanner;

public class Document {
	
	protected String text;
	
	public String toString() { return this.text; }
	
	public void setText(String str) {
		this.text = str;
	}
	
	public void setContentFromUser(Scanner scn) {
		setText(scn.nextLine());
	}
	
	public boolean isContain(String keyword) {
		return this.text.contains(keyword);
	}
	
	public void updateAttribute(String attrName, String newName) {
		if (attrName == "text") setText(newName);
		else System.out.println("The attribute doesn't exist.");
	}
}
