package TestClass;

import org.testng.annotations.Test;
import PageObjects.LoanCalculator;
import TestBase.BaseClass;

public class TC_3LoanCalculator extends BaseClass{

	@Test
	public void LoanCalculator1() throws InterruptedException {
		LoanCalculator l=new LoanCalculator(driver);
		l.switchToLoanCalculator();
			
	}
	@Test
	public void LoanCalculator2() throws InterruptedException {
		LoanCalculator l=new LoanCalculator(driver);
		l.Calculator_details();	
	}
	@Test
	public void LoanCalculator3() throws InterruptedException {
		LoanCalculator l=new LoanCalculator(driver);
		l.LoanAmount_details();
	}
	@Test
	public void LoanCalculator4() {
		LoanCalculator l=new LoanCalculator(driver);
		l.LoanTenura_details();
	}

}
