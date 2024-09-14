import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
 WebDriver driver;
    public Login_Page(WebDriver driver) {
        this.driver = driver;

}

By username = By.id("user-name");
By password = By.id("password");
By LoginButton = By.id("login-button");


public void Login()
{
    driver.findElement(username).sendKeys("standard_user");
    driver.findElement(password).sendKeys("secret_sauce");
    driver.findElement(LoginButton).click();
}
}





