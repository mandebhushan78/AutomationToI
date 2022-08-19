import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestHomePage extends BaseClass {



    @Before
    public void initialiseTest() throws Throwable {
        BaseClass baseClass = new BaseClass();
        baseClass.Setup();

    }

    @Test
    public void TestHomePage() {
        HomePage homePage = new HomePage();
        homePage.verifyHomepage();
    }

    @After
    public void closeTest() {
        BaseClass baseClass = new BaseClass();
        baseClass.closeApplication();
    }
}
