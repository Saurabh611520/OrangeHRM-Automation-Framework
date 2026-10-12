package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseClass;
import java.time.Duration;

public class DashboardTest extends BaseClass {

    @Test(priority = 1)
    public void loginFirst() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void verifyDashboardWidgets() {
        WebDriverWait wait = new WebDriverWait(d1, Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        Assert.assertTrue(d1.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
        System.out.println("Dashboard Verified Successfully");
    }
}