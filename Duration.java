

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Duration {
	static Logger log = Logger.getLogger(Duration.class.getName());
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		log.info("Please Enter the Date (YYYY/MM/DD): ");
		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		LocalDate d = LocalDate.of(year, month, day);
		LocalDate n = LocalDate.now();
		Period p = Period.between(d, n);
		log.info("Duration from given date: " + p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() +" days.");
		
		
		
		

	}

}
