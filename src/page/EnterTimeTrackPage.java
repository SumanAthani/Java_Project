package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	
	public void EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void verifyTitle(WebDriver driver,String eTitle)
	{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try {
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is Matching");
		}
	catch(Exception e)
	{
	Reporter.log("Title is NOT Matching");
	Assert.fail();
	}

}
}
