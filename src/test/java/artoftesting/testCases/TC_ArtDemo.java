package artoftesting.testCases;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import artoftesting.pageObjects.ArtDemoPage;

public class TC_ArtDemo extends BaseClass {
	
	
	@Test
	public void Demo()throws InterruptedException, IOException
	{  driver.get(baseUrl);
	   logger.info("Chrome is launced");
		//ArtDemoPage ADp=new ArtDemoPage(driver);
	
	/*   if(driver.getTitle().equals("Case"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"ArtDemo");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}*/
		
	  
	}
}
	
	