package cognizant;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends base{
KiteLogin1Page login1;
KiteLogin2Page login2;
KiteHomePage home;

@BeforeClass
//open browser
public void openbrowser() {
	initializebrowser();
	KiteLogin1Page login1 = new KiteLogin1Page(driver);
	KiteLogin2Page login2 = new KiteLogin2Page(driver);
	KiteHomePage home = new KiteHomePage(driver);
}
@BeforeMethod
public void loginApplication() throws Throwable {
	login1.enterUN(utility1.getTD(0, 0));
	login1.enterPWD(utility1.getTD(0, 1));
	login1.clickLOGINBTN();
	//System.out.println(utility1.getTD(0, 0));
	login2.enterPIN(utility1.getTD(0, 2));
    login2.clickcntBtn();	
}
@Test
public void verifyuserid() throws Throwable {
	Reporter.log("running verifyuserID",true);
	String actID= home.verifyuserID();
	String expID= utility1.getTD(0, 0);
	Assert.assertEquals(actID, expID);
	
}
@AfterMethod
public void logout() {
	Reporter.log("Logout");
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser");
}
}
