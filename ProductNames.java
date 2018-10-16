import java.util.*;

import org.apache.log4j.Logger;

public class ProductNames {
	static Logger log = Logger.getLogger(ProductNames.class.getName());

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
		log.info("Please key in the number of products.");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			log.info("Please key in product name.");
			String q = s.next();
			a1.add(q);
		}
		Collections.sort(a1);
		log.info(a1);

	}

}
