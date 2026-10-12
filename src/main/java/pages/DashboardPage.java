package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver d1;
    public DashboardPage(WebDriver d1) { this.d1 = d1; }

    public void clickProfile() throws InterruptedException {
        Thread.sleep(1000);
        d1.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
    }
    public void clickLogout() throws InterruptedException {
        Thread.sleep(1000);
        d1.findElement(By.xpath("//a[text()='Logout']")).click();
    }
}