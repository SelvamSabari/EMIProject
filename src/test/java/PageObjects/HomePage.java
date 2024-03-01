package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.ExcelUtilities;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Actions act=new Actions(driver);
	
	@FindBy(xpath ="//*[@class='loanproduct-nav']/li[@id='car-loan']")
	WebElement carLoan;

	@FindBy(xpath="//*[@id='loanamount']")
	WebElement Loanamount;

	@FindBy(xpath="//*[@id='loanamountslider']")
	WebElement Loanslider;

	@FindBy(xpath ="//*[@id='loaninterest']" )
	WebElement Loaninterest;

	@FindBy(xpath = "(//label[@class='btn btn-secondary']/child::input)[1]")
	WebElement Month;

	@FindBy(xpath = "//input[@name='loanterm']")
	WebElement Loanterm;

	@FindBy(xpath ="//*[@class='row gutter-left gutter-right']" )
	WebElement Scroller;

	@FindBy(xpath = "//*[@id='emiamount']/p/span")
	WebElement LoanEMI;

	@FindBy(xpath = "//*[@id='emitotalinterest']/p/span")
	WebElement TotalInterestPayable;

	@FindBy(xpath = "//*[@id='emitotalamount']/p/span" )
	WebElement TotalAmount;


public  void clickOnCarloan() {
	carLoan.click();
}
	public void car_Loan() throws IOException
	{
		Loanamount.clear();
		Loanamount.sendKeys(ExcelUtilities.getCellData("Sheet3", 0, 1));
		Loaninterest.sendKeys(Keys.BACK_SPACE);
		Loaninterest.sendKeys(Keys.BACK_SPACE);
		Loaninterest.sendKeys(Keys.BACK_SPACE);
		Loaninterest.sendKeys(ExcelUtilities.getCellData("Sheet3", 1, 1));
		//act.dragAndDropBy(Loanamount, -150, 50).perform();
		//Loaninterest.sendKeys(Keys.chord(Keys.CONTROL,"a",ExcelUtilities.getCellData("Sheet3", 1, 1)));
		Loanterm.clear();
		act.moveToElement(Month).doubleClick(Month).build().perform();
		Loanterm.sendKeys(Keys.BACK_SPACE);
		Loanterm.sendKeys(Keys.BACK_SPACE);
		Loanterm.sendKeys(ExcelUtilities.getCellData("Sheet3", 2, 1));
		Loanterm.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView();",Scroller);
	}
	public void Emi_for_oneyear() {
		
		System.out.println(LoanEMI.getText());
	}
	public int interest_amount_for_one_month() {
		String Text=TotalInterestPayable.getText();
		String[] value=Text.split(",");
		String value1=value[0]+value[1];
		int totalinteres=Integer.parseInt(value1);
		System.out.println(totalinteres);
		return totalinteres;
		
	}
	public int principal_amount_for_one_month() {
		int interest=interest_amount_for_one_month();
		String Total=TotalAmount.getText();
		String[] value2=Total.split(",");
		String value3=value2[0]+value2[1]+value2[2];
		int totalAmount=Integer.parseInt(value3);
		System.out.println("Principal Amount:"+(totalAmount-interest));
		return totalAmount-interest;
	}


	}

