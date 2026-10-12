package tests;

import org.testng.annotations.Test;
import pages.LeavePage;
import pages.LoginPage;
import utils.BaseClass;

public class LeaveTest extends BaseClass {
    @Test
    public void verifyLeaveModule() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(3000);

        LeavePage leave = new LeavePage(d1);
        leave.clickLeave();
        leave.clickApply();
        leave.verifyLeavePage();
    }
}