package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class BaseClass {
    public WebDriver d1;

    @BeforeClass
    public void setUp() {
        d1 = new ChromeDriver();
        d1.manage().window().maximize();
        d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Open Browser and URL");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        // d1.quit(); // aata comment thev, nantar un-comment kar
        System.out.println("Close Browser");
    }
}