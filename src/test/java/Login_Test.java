import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Test {
     private WebDriver driver;
    Login_Page loginPage;


@Test
public void LoginTest(){
     driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    Login_Page loginPage = new Login_Page(driver);
    loginPage.Login();
}}
