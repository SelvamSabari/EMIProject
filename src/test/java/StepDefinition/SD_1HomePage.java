package StepDefinition;
import java.io.IOException;
import Factory.BaseClass;
import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_1HomePage {
	HomePage h=new HomePage(BaseClass.getDriver());
	@Given("WebPage should navigate to the HomePage")
	public void web_page_should_navigate_to_the_home_page() {
	   h.clickOnCarloan();
	}
	@When("Enter loan Amount ,interest rate and loan Tenure")
	public void enter_loan_amount_interest_rate_and_loan_tenure() throws IOException {
	    h.car_Loan();
	}
	@Then("Find the Emi for one Year")
	public void find_the_emi_for_one_year() {
	    h.Emi_for_oneyear();
	}
	@Then("Display the principal amount for one month")
	public void display_the_principal_amount_for_one_month() {
	    h.principal_amount_for_one_month();
	}
	@Then("Display the Interest amount for one month")
	public void display_the_interest_amount_for_one_month() {
	    h.interest_amount_for_one_month();
	}
}
