package StepDefinition;
import java.io.IOException;
import Factory.BaseClass;
import PageObjects.HomeLoanEmiCalculators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SD_2HomeLoanEmiCalculators {
	HomeLoanEmiCalculators l=new HomeLoanEmiCalculators(BaseClass.getDriver());
	@Given("WebPage should navigate to the HomeLoan EMI Calculator")
	public void web_page_should_navigate_to_the_home_loan_emi_calculator() {
		l.switchToHomeloanEmi();
	    
	}
	@When("Enter the relevant details")
	public void enter_the_relevant_details() throws IOException {
	    l.Loan_details();
	    
	}
	@When("Store the datas in the Excel")
	public void store_the_datas_in_the_excel() throws IOException {
	   l.storingExeldatas();
	}
	
}
