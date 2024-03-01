************************************************PROJECT DESCRIPTION*****************************************************************

                                                            
Problem Statement : Find the Interest Amount for current year

1. Buying a  car of 15 Lac
2. Interest rate of 9.5%
3. Tenure should be 1 year.
Display the interest amount & principal amount of first month.
(Suggested Site: emicalculator.net  / HDFCbank.com etc. however you are free to use any other legitimate site)


Detailed Description: Hackath Ideas

1. Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year; Display the interest amount & principal amount for one month
2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from  year on year table & store in excel;
3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator
(Suggested Site: emicalculator.net  however you are free to use any other legitimate site)


Key Automation Scope:

Validation of transactions & do calculations;
Extract table values & store in excel
Filling data in screen & multiple UI validations
Navigation from Menus
Reusable methods
Scrolling down in web page


**********************************************************STEPS TO EXECUTE*************************************************************
 
-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute and we get the expected output as shown below.
 
*******************************************************FILES DESCRIPTION**************************************************************
 
1.src/test/java- There are five packages in this folder.
 
->factory :In this package there is one class BaseClass.
 
->pageobject : In this package, the Basepage, HomePage, HomeloanEmiCalculators and LoanCalculator classes are defined.
 
->stepdefinition : In this package,  HOOKS, SD_1HomePage, SD_2HomeLoanEmiCalculators and SD_3LoanCalculator classes are defined.
 
->testclass  : In this package, TC_1HomePage, TC_2HomeLoanEmiCalculators and TC_3LoanCalculator classes are defined.

->testrunner  : In this package, testRunner class is defined.
 
->Utility   : In this package, Excel class is defined,ExtentReportManager.
 
2.src/test/resources- In this folder three files config.properties, extent.properties are defined.
 
3.JRE System Library: In this File we have all dependencies of JAR.files.         
 
4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.Excelsheet: In this folder  we have read and write excel sheets are present.

6.FeatureFiles  : In this folder FEATURES feature file is defined.
 
7.logs:In this folder automation.log report is present.

8.src: In this, there are two folders
	-main:It is an empty folder
	-test:It has all the BaseClass, Basepage, pageobject files, Stepdefinition files, Excel, FeatureFiles and properties files.
 
9.target: In this folder cucumber-reports, generated-test-sources, maven-status and surefire-reports are present. 

10.test-output: In this folder default suite, junitreports and SparkReports are present.
 
11.Grptestng.xml: In this file, testNG xml code for groups is there.
 
12.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.
 
13.testng.xml : In this file, testNG xml code is there.
 
 
***************************************************************************************************************************************
 
                                                        OUTPUT ON CONSOLE
 
***************************************************************************************************************************************
 
[RemoteTestNG] detected TestNG version 7.4.0
[Configuration] [WARN] Detected a static method [stepdefinition.HOOKS.setup()]. Static configuration methods can cause  unexpected behavior.
[Configuration] [WARN] Detected a static method [stepdefinition.HOOKS.tearDown()]. Static configuration methods can cause  unexpected behavior.
[Configuration] [WARN] Detected a static method [stepdefinition.HOOKS.setup()]. Static configuration methods can cause  unexpected behavior.
[Configuration] [WARN] Detected a static method [stepdefinition.HOOKS.tearDown()]. Static configuration methods can cause  unexpected behavior.
[Configuration] [WARN] Detected a static method [stepdefinition.HOOKS.setup()]. Static configuration methods can cause  unexpected behavior.
[Configuration] [WARN] Detected a static method [stepdefinition.HOOKS.tearDown()]. Static configuration methods can cause  unexpected behavior.
Car Loan is displayed or not:
true
Loan EMI
₹15,11,875
Total Interest Payable
₹11,875
Total Payment
(Principal + Interest)
₹11,875
Principal Amount:1500000
Home Loan EMI calculator is displayed or not:
truee
********EMI calculator********
------------------------------
LaonAmount textbox is enabled or not:
true
LaonAmount Scale is enabled or not:
true
IntrestRate textbox is enabled or not:
true
IntrestRate Scale is enabled or not:
true
LoanTenure textbox is enabled or not:
true
LoanTenure Scale is enabled or not:
true
Fees & Charges textbox is enabled or not:
true
Fees & Charges Scale is enabled or not:
true
Year in Loantenure changed to month or not:
true
********Amount calculator********
---------------------------------
EMI textbox is enabled or not:
true
EMI Scale is enabled or not:
true
IntrestRate textbox is enabled or not:
true
IntrestRate Scale is enabled or not:
true
LoanTenure textbox is enabled or not:
true
LoanTenure Scale is enabled or not:
true
Fees & Charges textbox is enabled or not:
true
Fees & Charges Scale is enabled or not:
true
Year in Loantenure changed to month or not:
true
********LoanTenure calculator********
-------------------------------------
LaonAmount textbox is enabled or not:
true
LaonAmount Scale is enabled or not:
true
EMI textbox is enabled or not:
true
EMI Scale is enabled or not:
true
IntrestRate textbox is enabled or not:
true
IntrestRate Scale is enabled or not:
true
LoanTenure textbox is enabled or not:
true
LoanTenure Scale is enabled or not:
true
Fees & Charges textbox is enabled or not:
true
Fees & Charges Scale is enabled or not:
true

===============================================
Suite
Total tests run: 12, Passes: 12, Failures: 0, Skips: 0
===============================================
