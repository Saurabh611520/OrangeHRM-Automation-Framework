package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver d1;
    public LoginPage(WebDriver d1) { this.d1 = d1; }

    public void enterUsername(String uname) {
        d1.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
    }
    public void enterPassword(String pwd) {
        d1.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
    }
    public void clickLogin() {
        d1.findElement(By.xpath("//button[@type='submit']")).click();
    }
}