import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenProductPage {
    WebDriver driver;
    public OpenProductPage( WebDriver driver)
    {
      this.driver=driver;
    }


By username = By.id("user-name");
    By password = By.id("password");
    By LoginButton = By.id("login-button");
By ProductName = By.xpath("//div[text()= \"Sauce Labs Backpack\"]");

public void OpenProducts(){
    driver.findElement(username).sendKeys("standard_user");
    driver.findElement(password).sendKeys("secret_sauce");
    driver.findElement(LoginButton).click();
    driver.findElement(ProductName).click();

}}