import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Revised_Test {


    private WebDriver driver;
    @BeforeMethod
    public void Init()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }


    @Test
    public void TestLogin()
    {
      Home_Page homePage = new Home_Page(driver) ;
      homePage.login();
    }

}
