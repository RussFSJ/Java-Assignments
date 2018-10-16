import java.util.Scanner;

import org.apache.log4j.Logger;


class SalaryException extends Exception {
	SalaryException() {
		super("Salary is below $3000.");
	}
}
public class EmployeeException {
	
	static Logger log = Logger.getLogger(EmployeeException.class.getName());


	public void userSalary(int salary) throws SalaryException {
		if (salary < 3000) {
			throw new SalaryException();

		} else {
			log.info("Salary is over $3000.");
		}
	}

	public static void main(String[] args) {
		EmployeeException obj1 = new EmployeeException();
		Scanner s = new Scanner(System.in);
		log.info("Please Enter Your Salary.");
		int p = s.nextInt();
		try {
			obj1.userSalary(p);

		} catch (SalaryException e1) {

			log.info(e1.getMessage());
		}
		
	}
}

	


