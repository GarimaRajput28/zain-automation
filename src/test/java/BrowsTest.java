import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsTest {
    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browsers\\chromedriver\\chromedriver.exe");


// *[class='zn-ico icon-magnifying-glass']
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.31.27.20:8280/en/web/zos/");
        WebElement searchButton = driver.findElement(By.cssSelector("*[class='zn-ico icon-magnifying-glass']"));
        searchButton.click();
        //*_com_liferay_portal_search_web_search_bar_portlet_SearchBarPortlet_INSTANCE_templateSearch_zain-search
        WebElement searchInput= driver.findElement(By.id("_com_liferay_portal_search_web_search_bar_portlet_SearchBarPortlet_INSTANCE_templateSearch_zain-search"));
        searchInput.sendKeys("Apple");
        Thread.sleep(3000);
        searchInput.sendKeys(Keys.ARROW_DOWN);
        searchInput.sendKeys(Keys.ENTER);
    }
}
