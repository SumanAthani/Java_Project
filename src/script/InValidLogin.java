package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import page.LoginPage;

public class InValidLogin extends BaseTest {
	@Test(priority=2)
	public void testInValidLogin()
	{
		int rc=Lib.getRowCount(XL_PATH,"InValidLogin");
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			String un=Lib.getCellValue(XL_PATH,"InValidLogin",i,0);
			System.out.println(un);
			String pw=Lib.getCellValue(XL_PATH,"InValidLogin",i,1);
			System.out.println(pw);
			
			//Enter InValid Username
			LoginPage l=new LoginPage(driver);
			l.setUserName(un);
			//Enter InValid Password
			l.setPassword(pw);
			//Click on Login Button
			l.clickLogin();
			//Verify Error Message is Dispalyed
			l.verifyErrMsgIsDisplayed();
		}
	}

}
