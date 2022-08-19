import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public WebElement LogoTOI;

    public void verifyHomepage() {

        System.out.println("Test is started");

        WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
        //WebElement popup = driver.findElement(By.xpath("//button[normalize-space()='Maybe later']"));
        if (googleLogo.isDisplayed()) {
            System.out.println("Popup is displayed");
        } else {
            System.out.println("popup is not Displayed");
        }
        //button[normalize-space()='Maybe later']
        LogoTOI = driver.findElement(By.xpath("//a[@aria-label='TOI Logo']//img[@type='thumb']"));
        if (LogoTOI.isDisplayed()) {
            System.out.println("Time Of India Homepage Displayed");
            LogoTOI.click();
        } else {
            System.out.println("Time Of India Homepage is not Displayed");
        }

    }
}
