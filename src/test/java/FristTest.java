import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FristTest {
   WebDriver driver;
    By username = By.id("user-name");
    By password = By.id("password");
    By LoginButton = By.id("login-button");
    By BroductLabel = By.className("title");
    By UserName = By.id("user-name");
    By PassWord = By.id("password");
    By LoginBtn = By.id("login-button");
    By ErrorMessage = By.xpath("//div[@class=\"error-message-container error\"]");
    By Password = By.id("password");
    By ProductName = By.xpath("//div[text()= \"Sauce Labs Backpack\"]");
    By ProuctPrice = By.className("inventory_details_price");
    By addtocart = By.name("add-to-cart");
    By GoToCard = By.className("shopping_cart_container");
    By Checkoutbtn = By.id("checkout");
    By FristName = By.id("first-name");
    By FristNameField = By.id("first-name");
    By LastNameField = By.id("last-name");
    By PostalCodeField = By.id("postal-code");
    By ContinueBtn = By.id("continue");
    By CheckOutOverviewNotification = By.xpath("//span[text()=\"Checkout: Overview\"]");
    By FinishBTN = By.id("finish");
    By ThanksforCompleteOrder = By.xpath("//h2[text()=\"Thank you for your order!\"]");




    @BeforeMethod
    public void inicialize()
    {
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @Test
    public  void  openTest(){

        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(LoginButton).click();
        boolean IsProuctDisplayed =driver.findElement(BroductLabel).isDisplayed();
        Assert.assertTrue(IsProuctDisplayed);
    }

    @Test
    public void UnValidUserLogin()
    {
    driver.findElement(UserName).sendKeys("standard_use");
    driver.findElement(PassWord).sendKeys("secret_sauc");
    driver.findElement(LoginBtn).click();
   boolean IsErrorMessegeDisplayed = driver.findElement(ErrorMessage).isDisplayed();
  Assert.assertTrue(IsErrorMessegeDisplayed);
    }

    @Test
    public void  ClientSearchProduct()
    {

        driver.findElement(UserName).sendKeys("standard_user");
        driver.findElement(Password).sendKeys("secret_sauce");
        driver.findElement(LoginBtn).click();
        driver.findElement(ProductName).click();
        String PriceDetails = driver.findElement(ProuctPrice).getText();
        Assert.assertEquals(PriceDetails,"$29.99");

    }
    @AfterMethod
    public void AfterALLCases()
    {
        //driver.quit();
    }


    @Test
    public void BuyProduct()
    {
      driver.findElement(UserName).sendKeys("standard_user");
      driver.findElement(password).sendKeys("secret_sauce");
      driver.findElement(LoginButton).click();
      driver.findElement(ProductName).click();
      driver.findElement(addtocart).click();
      driver.findElement(GoToCard).click();
      driver.findElement(Checkoutbtn).click();
      boolean IsFristNameFieldDesplayed = driver.findElement(FristName).isDisplayed();
      Assert.assertTrue(IsFristNameFieldDesplayed);


    }

    @Test
            public void ProceedWithTheProduct()
    {
        driver.findElement(UserName).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(LoginButton).click();
        driver.findElement(ProductName).click();
        driver.findElement(addtocart).click();
        driver.findElement(GoToCard).click();
        driver.findElement(Checkoutbtn).click();
        driver.findElement(FristNameField).sendKeys("Dalia");
        driver.findElement(LastNameField).sendKeys("Nassar");
        driver.findElement(PostalCodeField).sendKeys("1234");
        driver.findElement(ContinueBtn).click();
        Boolean IsCheckoutOverviewDesplayed = driver.findElement(CheckOutOverviewNotification).isDisplayed();
        Assert.assertTrue(IsCheckoutOverviewDesplayed);
        driver.findElement(FinishBTN).click();
        Boolean IsThanksCompleteOrderDisplayed = driver.findElement(ThanksforCompleteOrder).isDisplayed();
        Assert.assertTrue(IsThanksCompleteOrderDisplayed);




    }

}
