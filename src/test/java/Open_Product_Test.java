import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_Product_Test {
    private WebDriver driver;
    OpenProductPage openProductPage;
   // Login_Page loginPage;

    @Test
    public void OpenProduct() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //loginPage = new Login_Page(driver);
         openProductPage = new OpenProductPage(driver);
       // loginPage.Login();
        openProductPage.OpenProducts();





}}