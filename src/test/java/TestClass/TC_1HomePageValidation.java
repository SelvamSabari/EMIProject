package TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC_1HomePageValidation extends BaseClass{
	
@Test
public void HomePageValidation() throws IOException {
	HomePage h=new HomePage(driver);
	h.clickOnCarloan();
}
@Test
public void HomePageValidation1() throws IOException {
	HomePage h=new HomePage(driver);
	h.car_Loan();
}
@Test
public void HomePageValidation2() {
	HomePage h=new HomePage(driver);
	h.Emi_for_oneyear();
}
@Test
public void HomePageValidation3() {
	HomePage h=new HomePage(driver);
	h.interest_amount_for_one_month();;
}
@Test
public void HomePageValidation4() {
	HomePage h=new HomePage(driver);
	h.principal_amount_for_one_month();
}


}
