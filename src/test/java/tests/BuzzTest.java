package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuzzPage;
import pages.LoginPage;
import utils.BaseClass;

public class BuzzTest extends BaseClass {

    @Test(priority = 1)
    public void loginFirst() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void verifyBuzzModuleAndCreatePost() throws InterruptedException {
        BuzzPage buzz = new BuzzPage(d1);
        buzz.clickBuzz();

        String myPost = "Automation Test Passed! By Saurabh - " + System.currentTimeMillis();
        buzz.enterPost(myPost);
        buzz.clickPostButton();

        Assert.assertTrue(buzz.isPostVisible(), "Buzz Post is visible on feed");
        System.out.println("Buzz Module 100% Working - Post Created: " + myPost);
    }
}