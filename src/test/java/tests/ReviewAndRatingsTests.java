package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Login;
import pages.ReviewAndRatings;

import java.sql.Driver;

public class ReviewAndRatingsTests {
    WebDriver driver = null;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();

         driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("http://10.31.27.20:8280/en/web/zos/");
    }
    @Test
    public void clickRRButton() throws InterruptedException {
        Thread.sleep(10 * 1000);
        login();
        driver.get("http://10.31.27.20:8280/en/web/zos/reviews-and-ratings?id=13292751");
        ReviewAndRatings rr = new ReviewAndRatings(driver);
        rr.findWriteReviewButton().click();


    }
    public void closeRR(){
        driver.close();
        driver.quit();
    }


    private void login(){
        Login lg= new Login(driver);
        driver.get("http://10.31.27.20:8280/en/web/zos/login");
        lg.userName().sendKeys("consumer2");
        lg.password().sendKeys("test2");
        lg.signInButton().click();
    }


}
