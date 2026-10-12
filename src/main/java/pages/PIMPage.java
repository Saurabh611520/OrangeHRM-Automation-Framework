package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PIMPage {
    WebDriver d1; WebDriverWait wait;
    public PIMPage(WebDriver d1) {
        this.d1 = d1;
        this.wait = new WebDriverWait(d1, Duration.ofSeconds(10));
    }
    public void clickPIM() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();
        Thread.sleep(2000);
    }
    public void clickAddEmployee() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Add')]"))).click();
        Thread.sleep(2000);
    }
    public void enterFirstName(String fname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']"))).sendKeys(fname);
    }
    public void enterLastName(String lname) {
        d1.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
    }
    public void clickSave() throws InterruptedException {
        d1.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
    }
}