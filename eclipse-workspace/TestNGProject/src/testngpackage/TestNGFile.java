package testngpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/*
 * Copyright 2021 Anie Pelletier.
 * All rights reserved.
 */
/**
 * The TestNGFile class is the class to test Google web site, using Chrome driver
 * whether it is up or not   
 * If it is up, the Google web site is opened and the title displays .
 * The TestNG Unit Test framework is used to verify this
 * Then, these codes can be deployed in Jenkins to run in a scheduled Job
 * It can be scheduled to run as often as the user wants to check for Google web site
 *
 * @author  Anie Pelletier
 * @version 1.0 11/18/21
 * 
 */
public class TestNGFile {
	 public String baseUrl = "https://www.google.com";
	    String driverPath = ".\\chromedriver.exe";
	    public WebDriver driver;
	    public String expected = null;
	    public String actual = null;
	    
  //Initiate the test using TestNG to start Chrome browser 
  @BeforeTest
	  public void launchBrowser() {
	  System.out.println("launching chrome browser"); 
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
      driver.get(baseUrl);
  }

  /*Running the test using TestNG, to verify whether the Google web is open
  and the title displays
  */
  @Test
  public void verifyHomepageTitle() {
      String expectedTitle = "Google";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);  
  }
       
  //Tear down the TestNg test and close the browser after the test finished
  @AfterTest
  public void terminateBrowser(){
      driver.close();
  }
}
