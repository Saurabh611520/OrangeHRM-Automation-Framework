package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PIMPage;
import utils.BaseClass;

public class PIMTest extends BaseClass {
    @Test(priority = 1)
    public void loginFirst() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void addEmployeeTest() throws InterruptedException {
        PIMPage pim = new PIMPage(d1);
        pim.clickPIM();
        pim.clickAddEmployee();
        pim.enterFirstName("Saurabh");
        pim.enterLastName("Yevale");
        pim.clickSave();
    }
}