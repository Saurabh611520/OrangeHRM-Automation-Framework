package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AdminPage {
    WebDriver d1; WebDriverWait wait;
    public AdminPage(WebDriver d1) {
        this.d1 = d1;
        this.wait = new WebDriverWait(d1, Duration.ofSeconds(10));
    }
    public void clickAdmin() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();
        Thread.sleep(2000);
    }
    public void clickAddUser() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();
        Thread.sleep(2000);
    }
    public void selectUserRole() throws InterruptedException {
        d1.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//span[text()='ESS']"))).click();
    }
    public void selectStatus() throws InterruptedException {
        d1.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//span[text()='Enabled']"))).click();
    }
    public void enterEmployeeName(String name) throws InterruptedException {
        d1.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(name);
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//span"))).click();
    }
    public void enterUsername(String user) {
        d1.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(user);
    }
    public void enterPassword(String pwd) {
        d1.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pwd);
    }
    public void enterConfirmPassword(String pwd) {
        d1.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pwd);
    }
    public void clickSave() throws InterruptedException {
        d1.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
    }
}