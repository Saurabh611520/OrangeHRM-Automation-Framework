package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RecruitmentPage;
import utils.BaseClass;

public class RecruitmentTest extends BaseClass {

    @Test(priority = 1)
    public void loginFirst() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void addCandidateTest() throws InterruptedException {
        RecruitmentPage rp = new RecruitmentPage(d1);
        rp.clickRecruitment();
        rp.clickAddCandidate();
        rp.enterCandidateName("Saurabh", "Yevale");
        rp.enterEmail("saurabh" + System.currentTimeMillis() + "@gmail.com");
        System.out.println("Recruitment Add Candidate Verified");
        Assert.assertTrue(d1.getCurrentUrl().contains("recruitment"));
    }
}