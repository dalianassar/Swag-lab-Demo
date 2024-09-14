import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuyProduct_Test {

    WebDriver driver;
    Login_Page loginPage;
    OpenProductPage openProductPage;
    BuyProduct_Page buyProductPage;

    @Test
    public void procedwiththeproduct() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        loginPage = new Login_Page(driver);
        openProductPage = new OpenProductPage(driver);
        buyProductPage = new BuyProduct_Page(driver);
        loginPage.Login();
        openProductPage.OpenProducts();
        buyProductPage.Buyprodcuct();
    }}