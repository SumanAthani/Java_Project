package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority=1,groups= {"login","smoke"})
	public void testValidLogin()
	{
		String un=Lib.getCellValue(XL_PATH,"Validlogin",1,0);
		System.out.println(un);
		String pw=Lib.getCellValue(XL_PATH,"Validlogin",1,1);
		System.out.println(pw);
		String title=Lib.getCellValue(XL_PATH, "ValidLogin",1,2);
		System.out.println(title);
		//Enter Valid UserName
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		
		//Enter Valid Password
		l.setPassword(pw);
		//Click on Login Button
		l.clickLogin();
		//Verify Home Page is Dispalyed
		EnterTimeTrackPage e=new EnterTimeTrackPage();
		e.verifyTitle(driver, title);
		
	}

}
