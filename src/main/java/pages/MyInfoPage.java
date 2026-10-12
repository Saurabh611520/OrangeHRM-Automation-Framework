package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MyInfoPage {
    WebDriver d1; WebDriverWait wait;
    
    public MyInfoPage(WebDriver d1) {
        this.d1 = d1;
        this.wait = new WebDriverWait(d1, Duration.ofSeconds(15));
    }
    
    public void clickMyInfo() throws InterruptedException {
        // Fixed xpath - OrangeHRM latest
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Info']"))).click();
        Thread.sleep(3000);
    }
    
    public void verifyMyInfoPage() {
        // Fixed - wait for page load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Personal Details']")));
        System.out.println("My Info Page Verified - Personal Details Page Opened");
    }
}