package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {
	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY,CHROME_VAL);
		System.setProperty(GECKO_KEY,GECKO_VAL);
			}
	
	@BeforeMethod
	public void openApplication()
	{
		driver=new ChromeDriver();
		String url=Lib.getPpt(CONFIG_PATH,"URL");
		driver.get(url);
		String strITO=Lib.getPpt(CONFIG_PATH,"ITO");
		Long ITO=Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
	}

}
