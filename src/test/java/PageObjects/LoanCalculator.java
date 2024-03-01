package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoanCalculator extends BasePage{
	public LoanCalculator(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@title='Calculators']")
	WebElement Calculators;
	
	@FindBy(xpath = "//*[@title='Loan Calculator']" )
	WebElement LoanCalculator;
	
	@FindBy(xpath = "//*[@id='emi-calc']")
	WebElement emicalc;
	
	@FindBy(xpath ="//*[@id='loanamount']" )
	WebElement loanamount1;
	
	@FindBy(xpath = "//*[@id='loanamountslider']")
	WebElement loanamountslider1;
	
	@FindBy(xpath ="//*[@id='loaninterest']" )
	WebElement loaninterest1;
	
	@FindBy(xpath = "//*[@id='loaninterestslider']")
	WebElement loaninterestslider1;
	
	@FindBy(xpath = "//*[@id='loanterm']" )
	WebElement loanterm1;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement loantermslideryear;
	
	@FindBy(xpath = "(//*[@class='btn btn-secondary'])[1]")
	WebElement loantermmonth;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement loantermslidermonth;
	
	@FindBy(xpath = "//*[@id='loanfees']")
	WebElement loanfees1;
	
	@FindBy(xpath = "//*[@id='loanfeesslider']")
	WebElement loanfeesslider1;
	
	@FindBy(xpath = "(//*[@class='hidden-ts'])[2]")
	WebElement Loanamountcalculator;
	
	@FindBy(xpath = "//*[@id='loanemi']")
	WebElement loanemi;
	
	@FindBy(xpath = "//*[@id='loanemislider']")
	WebElement loanemislider;
	
	@FindBy(xpath = "//*[@id='loaninterest']")
	WebElement loaninterest2;
	
	@FindBy(xpath = "//*[@id='loaninterestslider']")
	WebElement loaninterest2slider;
	
	@FindBy(xpath = "//*[@id='loanterm']")
	WebElement loanterm2;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]")
	WebElement loanterm2slideryear;
	
	@FindBy(xpath = "(//*[@class='btn btn-secondary'])[1]")
	WebElement loantermmonth1;
	
	@FindBy(xpath = "(//span[@class='marker'])[25]" )
	WebElement loantermslidermonth1;
	
	@FindBy(xpath = "//*[@id='loanfees']")
	WebElement loanfees2;
	
	@FindBy(xpath = "//*[@id='loanfeesslider']" )
	WebElement loanfees2slider;
	
	@FindBy(xpath = "(//*[@class='hidden-ts'])[3]")
	WebElement Loantenuracalculator;
	
	@FindBy(xpath = "//*[@id='loanamount']" )
	WebElement loanamount2;
	
	@FindBy(xpath = "//*[@id='loanamountslider']" )
	WebElement loanamount2slider;
	
	@FindBy(xpath = "//*[@id='loanemi']")
	WebElement loanemi2;
	
	@FindBy(xpath = "//*[@id='loanemislider']")
	WebElement loanemi2slider;
	
	@FindBy(xpath = "//*[@id='loaninterest']")
	WebElement loaninterest3;
	
	@FindBy(xpath = "//*[@id='loaninterestslider']" )
	WebElement loaninterest3slider;
	
	@FindBy(xpath = "//*[@id='loanfees']" )
	WebElement loanfees3;
	
	@FindBy(xpath = "//*[@id='loanfeesslider']" )
	WebElement loanfees3slider;
	
	public void switchToLoanCalculator() {
		Calculators.click();
		LoanCalculator.click();
	}
	
	public void Calculator_details() throws InterruptedException {
		
		if(loanamount1.isEnabled()==true) {
			 System.out.println("loanamount is validated");
		 }
		if(loanamountslider1.isEnabled()==true) {
			 System.out.println("loanamountslider1 is validated");
		 }
		if(loaninterest1.isEnabled()==true) {
			 System.out.println("loaninterest1 is validated");
		 }
		if(loaninterestslider1.isEnabled()==true) {
			 System.out.println("loaninterestslider1 is validated");
		 }
		String value4=loantermslideryear.getText();
		loantermmonth.click();
		Thread.sleep(3000);
		String value5=loantermslidermonth.getText();
		 if(value4.equals(value5)) {
			 System.out.println("Values are not changing");
		 }
		 else {
			 System.out.println("Values are changing validated");
		 }
		 
		 if(loanfees1.isEnabled()==true) {
			 System.out.println("loanfees1 is validated");
		 }
		 if(loanfeesslider1.isEnabled()==true) {
			 System.out.println("loanfeesslider1 is validated");
		 }
	}
	
	public void LoanAmount_details() throws InterruptedException {
		 Loanamountcalculator.click();
		 if(loanemi.isEnabled()==true) {
			 System.out.println("loanemi is validated");
		 }
		 if(loanemislider.isEnabled()==true) {
			 System.out.println("loanemislider is validated");
		 }
		 if(loaninterest2.isEnabled()==true) {
			 System.out.println("loaninterest2 is validated");
		 }
		 if(loaninterest2slider.isEnabled()==true) {
			 System.out.println("loaninterest2slider is validated");
		 }
		 String value6=loanterm2slideryear.getText();
		 loantermmonth1.click();
		 Thread.sleep(3000);
		 String value7=loantermslidermonth1.getText();
		 if(value6.equals(value7)) {
			 System.out.println("Values are not changing");
		 }
		 else {
			 System.out.println("Values are changing validated");
		 }
		 if(loanfees2.isEnabled()==true) {
			 System.out.println("loanfees2 is validated");
		 }
		 if(loanfees2slider.isEnabled()==true) {
			 System.out.println("loanfees2slider is validated");
		 }
	}
	
	public void LoanTenura_details() {
		 Loantenuracalculator.click();
		 if(loanamount2.isEnabled()==true) {
			 System.out.println("loanamount2 is validated");
		 }
		 if(loanamount2slider.isEnabled()==true) {
			 System.out.println("loanamount2slider is validated");
		 }
		 if(loanemi2.isEnabled()==true) {
			 System.out.println("loanemi2 is validated");
		 }
		 if(loanemi2slider.isEnabled()==true) {
			 System.out.println("loanemi2slider is validated");
		 }
		 if(loaninterest3.isEnabled()==true) {
			 System.out.println("loaninterest3 is validated");
		 }
		 if(loaninterest3slider.isEnabled()==true) {
			 System.out.println("loaninterest3slider is validated");
		 }
		 if(loanfees3.isEnabled()==true) {
			 System.out.println("loanfees3 is validated");
		 }
		 if(loanfees3slider.isEnabled()==true) {
			 System.out.println("loanfees3slider is validated");
		 }
			
	}	
}
