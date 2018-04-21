import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface func {
	void run(Document doc);
}

public class Infomation {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Document doc;
		
		func functionA = new func() { @Override public void run(Document doc) { funcA(doc); } };
		func functionB = new func() { @Override public void run(Document doc) { funcB(doc); } };
		func functionC = new func() { @Override public void run(Document doc) { funcC(doc); } };
		
		Map<Character, func> funcMap = new HashMap<>();
		funcMap.put('A', functionA);
		funcMap.put('B', functionB);
		funcMap.put('C', functionC);
		
		char mode = scn.nextLine().charAt(0);
		String type = scn.nextLine();
		switch (type) {
			case "Document": doc = new Document(); break;
			case "Email": doc = new Email(); break;
			case "File": doc = new File(); break;
			default: doc = null;
		}
		
		/* Run corresponding function */
		if (doc != null) funcMap.get(mode).run(doc);
				
		scn.close();
	}
	
	public static void funcA(Document doc) {
		Scanner reader  = new Scanner(System.in);
		doc.setContentFromUser(reader);
		System.out.println(doc.toString());
		reader.close();
	}

	public static void funcB(Document doc) {
		Scanner reader  = new Scanner(System.in);
		doc.setContentFromUser(reader);
		System.out.println(doc.isContain(reader.nextLine()));
		reader.close();
	}

	public static void funcC(Document doc) {
		Scanner reader  = new Scanner(System.in);
		doc.setContentFromUser(reader);
		String attrName =  reader.nextLine();
		String newName = reader.nextLine();
		doc.updateAttribute(attrName, newName);
		System.out.println(doc.toString());
		reader.close();
	}
	
}