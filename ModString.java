import java.util.Scanner;

import org.apache.log4j.Logger;

public class ModString {
	static Logger log = Logger.getLogger(ModString.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		log.info("Enter String: ");
		String a = s.next();
		log.info("Enter Option: ");
		String b = s.next();
		switch (b) {

		case "1":
			log.info(a + a);
			break;
		case "2":
			for (int i = 0; i < a.length() + 1; i++) {
				if (i % 2 == 0) {
					a = a.substring(0, i - 1) + "#"
							+ a.substring(i, a.length());
				}
			}
			log.info(a);
			break;
		case "3":
			String c = "";
			for (int j = 0; j < a.length(); j++) {
				if (!c.contains(String.valueOf(a.charAt(j)))){
					c += String.valueOf(a.charAt(j));
				}
			}
			log.info(c);
			break;
		case "4":
			String d = "";
			for (int i = 0; i < a.length(); i++) {
				if (i % 2 != 0) {
					d += String.valueOf(a.charAt(i)).toUpperCase();
					
				}
				else {
					d += String.valueOf(a.charAt(i));
				}
			}
			log.info(d);
			break;
		default:
			log.error("Enter 1, 2, 3 or 4.");
		}

	}

}
