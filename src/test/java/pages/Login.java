package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {
    public WebDriver driver= null;
    public Login(WebDriver driverinput){
        driver =driverinput;
    }
    public  WebElement userName(){
        return driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login"));
    }

    public WebElement password(){
        return  driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_password"));
    }

    public  WebElement signInButton(){
        return driver.findElement(By.cssSelector("button.btn.btn-primary.btn-default"));
    }
}
