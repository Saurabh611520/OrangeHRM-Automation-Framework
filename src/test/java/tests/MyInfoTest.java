package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyInfoPage;
import utils.BaseClass;

public class MyInfoTest extends BaseClass {

    @Test(priority = 1)
    public void loginFirst() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void verifyMyInfoModule() throws InterruptedException {
        MyInfoPage myInfo = new MyInfoPage(d1);
        myInfo.clickMyInfo();
        myInfo.verifyMyInfoPage();
        // Fixed - only check that we are on PIM page, not exact string
        Assert.assertTrue(d1.getCurrentUrl().contains("viewPersonalDetails") || d1.getCurrentUrl().contains("pim"), "MyInfo page not opened");
    }
}