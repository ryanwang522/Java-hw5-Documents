import java.util.Scanner;

public class Email extends Document {
	
	private String sender;
	private String recipient;
	private String title;
	
	public String toString() {
		return "From: " + this.sender
				+ "\nTo: " + this.recipient  
				+ "\nTitle: " + this.title + "\n"
				+ this.text + "\n";
	}

	public void setContentFromUser(Scanner scn) {
		setSender(scn.nextLine());
		setRecipient(scn.nextLine());
		setTitle(scn.nextLine());
		setText(scn.nextLine());
	}
	
	public void updateAttribute(String attrName, String newName) {
		switch (attrName) {
		case "text": setText(newName); break;
		case "sender": setSender(newName); break;
		case "recipient": setRecipient(newName); break;
		case "title": setTitle(newName); break;
		default: 
			System.out.println("The attribute doesn't exist.");
			break;
		}
	}
	
	public void setSender(String str) { this.sender = str; }
	
	public String getSender() { return this.sender; }
	
	public void setRecipient(String str) { this.recipient = str; }
	
	public String getRecipient() { return this.recipient; }
	
	public void setTitle(String str) { this.title = str; }
	
	public String getTitle() { return this.title; }
}
