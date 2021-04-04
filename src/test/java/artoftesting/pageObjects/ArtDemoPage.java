package artoftesting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArtDemoPage {
 WebDriver ldriver;
 public ArtDemoPage(WebDriver rdriver)
 {
	 ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
 }
	
	
	
	
	
}
