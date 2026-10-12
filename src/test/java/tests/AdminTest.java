package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;
import utils.BaseClass;

public class AdminTest extends BaseClass {
    @Test(priority = 1)
    public void loginFirst() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void addAdminUserTest() throws InterruptedException {
        AdminPage admin = new AdminPage(d1);
        admin.clickAdmin();
        admin.clickAddUser();
        admin.selectUserRole();
        admin.selectStatus();
        admin.enterEmployeeName("Orange Test");
        String user = "Saurabh" + System.currentTimeMillis();
        admin.enterUsername(user);
        admin.enterPassword("Test@1234");
        admin.enterConfirmPassword("Test@1234");
        admin.clickSave();
    }
    @Test(priority = 3)
    public void searchUserTest() {
        Assert.assertTrue(d1.findElement(By.xpath("//span[text()='Admin']")).isDisplayed());
    }
}