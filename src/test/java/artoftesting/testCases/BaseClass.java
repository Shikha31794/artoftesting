package artoftesting.testCases;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseUrl="https://artoftesting.com/samplesiteforselenium";
	public static WebDriver driver;
	public static Logger logger;
	public static ITestResult result;
@BeforeClass
	void setUp()
	{ //For browsers
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32_Latest/chromedriver.exe");
		 driver  = new ChromeDriver();
		 logger = Logger.getLogger("demo");//For logger 
		 PropertyConfigurator.configure("Log4j.properties");
	}
@AfterClass
    void teardown()
    {
	driver.quit();
    }
	//For screen shot
//public void captureScreen(WebDriver driver, String tname) throws IOException 
	/*public void captureScreen(WebDriver driver,ITestResult result) throws IOException{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File target = new File(System.getProperty("user.dir") + "/Screenshot/" + result.getName() + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");*/
	
	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				File target = new File(System.getProperty("user.dir") + "/Screenshot/" + result.getName() + ".png");
				FileUtils.copyFile(source, target);
				System.out.println("Screenshot taken");
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}
	//driver.quit();
	}

}

