package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LeavePage {
    WebDriver d1; WebDriverWait wait;
    public LeavePage(WebDriver d1) {
        this.d1 = d1;
        this.wait = new WebDriverWait(d1, Duration.ofSeconds(10));
    }
    public void clickLeave() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']"))).click();
        Thread.sleep(2000);
    }
    public void clickApply() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Apply']"))).click();
        Thread.sleep(2000);
    }
    public void verifyLeavePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Apply Leave']")));
        System.out.println("Leave Page Verified");
    }
}