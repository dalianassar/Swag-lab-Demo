import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    private WebDriver driver;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By LoginButton = By.id("login-button");

    public void login() {

        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(LoginButton).click();

    }
}
