package PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.ExcelUtilities;

public class HomeLoanEmiCalculators extends BasePage {
	
	public HomeLoanEmiCalculators(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//*[text()='Calculators']")
    WebElement Calculators;
	
	@FindBy(xpath = "//*[text()='Home Loan EMI Calculator']")
	WebElement HomeLoanEMI;
	
	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	WebElement HomeValue;
	
	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	WebElement MarginORDownPayment;
	
	@FindBy(xpath = "(//*[@class='form-control'])[3]")
	WebElement LoanInsurance;
	
	@FindBy(xpath = "(//*[@class='form-control'])[5]")
	WebElement InterestRate;
	
	@FindBy(xpath = "(//*[@class='form-control'])[6]")
	WebElement LoanTenure;
	
	@FindBy(xpath = "(//*[@class='form-control'])[7]")
	WebElement LoanFees;
	
	@FindBy(xpath = "(//*[@class='form-control'])[9]")
	WebElement OnetimeExpenses;
	
	@FindBy(xpath = "(//*[@class='form-control'])[10]")
	WebElement PropertyTaxesyear;
	
	@FindBy(xpath = "(//*[@class='form-control'])[11]" )
	WebElement HomeInsuranceyear;
	
	@FindBy(xpath = "(//*[@class='form-control'])[12]")
	WebElement MaintenanceExpensesmonth;
	
	@FindBy(xpath="//div[@id='paymentschedule']/table")
	WebElement yearOnYeartable;
	
	@FindBy(xpath="//table[@class='noextras']/tbody/tr")
	List<WebElement> tablerow;
	
	@FindBy(xpath="//table[@class='noextras']/tbody")
    WebElement table;
	
	public void switchToHomeloanEmi() {
		Calculators.click();
		HomeLoanEMI.click();
	}

	public void Loan_details() throws IOException {
		HomeValue.clear();
		HomeValue.sendKeys(ExcelUtilities.getCellData("Sheet2", 0, 1));
		MarginORDownPayment.clear();
		MarginORDownPayment.sendKeys(ExcelUtilities.getCellData("Sheet2", 1, 1));
		LoanInsurance.clear();
		LoanInsurance.sendKeys(ExcelUtilities.getCellData("Sheet2", 2, 1));
		InterestRate.sendKeys(Keys.chord(Keys.CONTROL,"a",ExcelUtilities.getCellData("Sheet2", 3, 1)));
		LoanTenure.sendKeys(Keys.chord(Keys.CONTROL,"a",ExcelUtilities.getCellData("Sheet2", 4, 1)));
		LoanFees.clear();
		LoanFees.sendKeys(ExcelUtilities.getCellData("Sheet2", 5, 1));
		OnetimeExpenses.clear();
		OnetimeExpenses.sendKeys(ExcelUtilities.getCellData("Sheet2", 6, 1));
		PropertyTaxesyear.clear();
		PropertyTaxesyear.sendKeys(ExcelUtilities.getCellData("Sheet2", 7, 1));
		HomeInsuranceyear.clear();
		HomeInsuranceyear.sendKeys(ExcelUtilities.getCellData("Sheet2", 8, 1));
		MaintenanceExpensesmonth.sendKeys(Keys.ENTER);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", yearOnYeartable);
				
	}
	public  void storingExeldatas() throws IOException {
		 //Writes only the rows in the  table
		 ExcelUtilities.write("Sheet1", 0, 0,"Year");
		 ExcelUtilities.write("Sheet1", 0, 1,"Principal");
		 ExcelUtilities.write("Sheet1", 0, 2,"Interest");
		 ExcelUtilities.write("Sheet1", 0, 3,"Taxes, Home Insurance & Maintenance (C)");
		 ExcelUtilities.write("Sheet1", 0, 4,"Total Payment ");
		 ExcelUtilities.write("Sheet1", 0, 5,"Balance");
		 ExcelUtilities.write("Sheet1", 0, 6,"Loan Paid To Date");

		 int sizeOfrows=tablerow.size();
		 for( int r=2;r<=sizeOfrows;r=r+2) {
			String Year= table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
			String Principal= table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
			String Interest= table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
			String Taxes= table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
			String Total_Payment= table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
			String Balance= table.findElement(By.xpath("tr["+r+"]/td[6]")).getText();
			String Loan=table.findElement(By.xpath("tr["+r+"]/td[7]")).getText();
			 ExcelUtilities.write("Sheet1",r , 0,Year );
			 ExcelUtilities.write("Sheet1",r , 1,Principal );
			 ExcelUtilities.write("Sheet1",r , 2,Interest );
			 ExcelUtilities.write("Sheet1",r , 3,Taxes );
			 ExcelUtilities.write("Sheet1",r , 4,Total_Payment );
			 ExcelUtilities.write("Sheet1",r , 5,Balance );
			 ExcelUtilities.write("Sheet1",r , 6,Loan);
		 }

	 }

}
