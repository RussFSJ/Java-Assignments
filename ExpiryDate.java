import java.time.LocalDate;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class ExpiryDate {
	static Logger log = Logger.getLogger(ExpiryDate.class.getName());

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		log.info("Please Enter Purchase Date (YYYY/MM/DD): ");
		int y1 = s.nextInt();
		int m1 = s.nextInt();
		int d1 = s.nextInt();
		LocalDate d = LocalDate.of(y1, m1, d1);
		log.info("Please Enter Warranty Period (no. of year(s) and month(s)): ");
		int y2 = s.nextInt();
		int m2 = s.nextInt();
		log.info("Expiry Date: " + d.plusYears(y2).plusMonths(m2));
		
		
		
		
	}

}
