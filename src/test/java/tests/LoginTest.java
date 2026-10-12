package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utils.BaseClass;
import java.time.Duration;

public class LoginTest extends BaseClass {
    @Test(priority = 1)
    public void validLogin() throws InterruptedException {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
        WebDriverWait wait = new WebDriverWait(d1, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        Assert.assertTrue(d1.getCurrentUrl().contains("dashboard"));
        DashboardPage dp = new DashboardPage(d1);
        dp.clickProfile();
        dp.clickLogout();
    }
    @Test(priority = 2)
    public void invalidLogin() {
        LoginPage lp = new LoginPage(d1);
        lp.enterUsername("Admin");
        lp.enterPassword("wrong123");
        lp.clickLogin();
        Assert.assertTrue(d1.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")).isDisplayed());
    }
}