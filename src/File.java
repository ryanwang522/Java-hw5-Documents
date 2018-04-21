import java.util.Scanner;

public class File extends Document {
	
	private String pathName;
	
	public String toString() {
		return "Path: " + this.pathName + "\n" + this.text + "\n";
	}
	
	public void  setPathName(String str) {
		this.pathName = str;
	}
	
	public void setContentFromUser(Scanner scn) {
		setPathName(scn.nextLine());
		setText(scn.nextLine());
	}
	
	public String getPathName() { return this.pathName; }

	public void updateAttribute(String attrName, String newName) {
		switch (attrName) {
		case "text": setText(newName); break;
		case "pathname": setPathName(newName); break;
		default: 
			System.out.println("The attribute doesn't exist.");
			break;
		}
	}
}
