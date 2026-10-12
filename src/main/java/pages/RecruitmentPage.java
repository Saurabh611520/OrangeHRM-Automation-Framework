package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RecruitmentPage {
    WebDriver d1; WebDriverWait wait;
    public RecruitmentPage(WebDriver d1) {
        this.d1 = d1;
        this.wait = new WebDriverWait(d1, Duration.ofSeconds(10));
    }
    public void clickRecruitment() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Recruitment']"))).click();
        Thread.sleep(2000);
    }
    public void clickAddCandidate() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();
        Thread.sleep(2000);
    }
    public void enterCandidateName(String fname, String lname) {
        d1.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
        d1.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
    }
    public void enterEmail(String email) {
        d1.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys(email);
    }
}