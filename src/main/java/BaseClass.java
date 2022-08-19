import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

    public WebDriver driver;

    public void Setup() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Chrome Browser is Launched");
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        System.out.println("Google India website Opened");
    }


    public void closeApplication() {
        driver.quit();
        System.out.println("Chrome Browser is Closed");
    }
}
