package pages;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Class
public class ReviewAndRatings {

    // Properties
    private WebDriver driverRR = null;

    // constructor
    public ReviewAndRatings(WebDriver driver){
        driverRR = driver;
    }

    // Method
    public WebElement findWriteReviewButton(){
        return driverRR.findElement(By.xpath("//a[contains(text(),'WRITE A CUSTOMER REVIEW')]"));
    }

    // Method
    public WebElement switchToWriteReview(){
        WebElement reviewIframe = driverRR.findElement(By.cssSelector("iframe.cke_wysiwyg_frame.cke_reset"));
        driverRR.switchTo().frame(reviewIframe);
        return driverRR.findElement(By.tagName("body"));
    }


}
