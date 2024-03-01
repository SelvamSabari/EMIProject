package StepDefinition;

import Factory.BaseClass;
import PageObjects.LoanCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD_3LoanCalculator {
	LoanCalculator c=new LoanCalculator(BaseClass.getDriver());
	@Given("WebPage should navigate to the LoanCalculator")
	public void web_page_should_navigate_to_the_loan_calculator() {
	    c.switchToLoanCalculator();
	}
	@Then("Perform UI validation for all textBoxes and slider for EmiCalculator")
	public void perform_ui_validation_for_all_text_boxes_and_slider_for_emi_calculator() throws InterruptedException {
	    c.Calculator_details();
	}
	@Then("Perform UI validation for all textboxes and slider for LoanAmount Calculator")
	public void perform_ui_validation_for_all_textboxes_and_slider_for_loan_amount_calculator() throws InterruptedException {
	    c.LoanAmount_details();
	}
	@Then("Perform UI validation for all textboxes and slider for LoanTenure Calculator")
	public void perform_ui_validation_for_all_textboxes_and_slider_for_loan_tenure_calculator() {
	    c.LoanTenura_details();
	}
	

}
