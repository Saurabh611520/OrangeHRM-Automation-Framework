package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BuzzPage {
    WebDriver d1;
    WebDriverWait wait;

    public BuzzPage(WebDriver d1) {
        this.d1 = d1;
        this.wait = new WebDriverWait(d1, Duration.ofSeconds(15));
    }

    public void clickBuzz() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Buzz']"))).click();
        Thread.sleep(3000);
    }

    public void enterPost(String post) throws InterruptedException {
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@class,'oxd-buzz-post-input')]"))).click();
        d1.findElement(By.xpath("//textarea[contains(@class,'oxd-buzz-post-input')]")).sendKeys(post);
        Thread.sleep(1000);
    }

    public void clickPostButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Post ']"))).click();
        Thread.sleep(4000);
    }

    public boolean isPostVisible() {
        try {
            // Feed madhe first post check
            return wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//div[contains(@class,'oxd-buzz-post')])[1]"))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}