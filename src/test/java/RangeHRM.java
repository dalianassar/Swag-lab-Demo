import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.*;

public class RangeHRM {
    WebDriver driver;
    By UserNameField = By.xpath("//input[@name=\"username\"]");
    By PasswordField = By.xpath("//input[@name=\"password\"]");
    By LoginBTN = By.xpath("//div[@class=\"oxd-form-actions orangehrm-login-action\"]");
    By AdminItem = By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]");
    By EmploweeName = By.xpath("//div[text()=\"Employee Name\"]");
    @BeforeMethod
    public void OpenWebsite() {
        driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void LoginAction() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //WebDriverWait wait = new WebDriverWait(driver, ofSeconds(6));
        //wait.until(d -> UserNameField.isdisplayed());
        driver.findElement(UserNameField).sendKeys("Admin");
        driver.findElement(PasswordField).sendKeys("admin123");
        driver.findElement(LoginBTN).click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.findElement(AdminItem).click();
        Boolean IsEmplweeNameIsDesplayed = driver.findElement(EmploweeName).isDisplayed();
        Assert.assertTrue(IsEmplweeNameIsDesplayed);


    }
}

