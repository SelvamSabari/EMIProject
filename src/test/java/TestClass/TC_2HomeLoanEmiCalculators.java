package TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomeLoanEmiCalculators;
import TestBase.BaseClass;

public class TC_2HomeLoanEmiCalculators extends BaseClass{

 @Test
 public void HomeLoanCalculation() throws IOException {
	 HomeLoanEmiCalculators h=new HomeLoanEmiCalculators(driver);
	 h.switchToHomeloanEmi();	 	
	 }
 @Test
 public void HomeLoanCalculation1() throws IOException {
	 HomeLoanEmiCalculators h=new HomeLoanEmiCalculators(driver);
	 h.Loan_details();
	
 }
 @Test
 public void HomeLoanCalculation2() throws IOException {
	 HomeLoanEmiCalculators h=new HomeLoanEmiCalculators(driver);
	 h.storingExeldatas();
 }
	 	
 
 }

