package step.defination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.clas.LibGlobal;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class HookClass extends LibGlobal {
	
	
	
	@Before(order=1)
	public void launchbrowser() throws IOException {
		browserLaunch("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		DateTime();
		implitywait(20);
		}
	@Before(order=2)
	@After
     public void closeBrowser(Scenario sc)  {
		if (sc.isFailed()) {
			
			
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
	    sc.embed(screenshotAs, "img.png");
		driver.manage().deleteAllCookies();
		DateTime();
		close();
	}

}}
