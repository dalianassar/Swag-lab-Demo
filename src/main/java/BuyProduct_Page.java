import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyProduct_Page {
    WebDriver driver ;
    public BuyProduct_Page (WebDriver driver)
    {
     this.driver =driver;
    }


    By addtocart = By.name("add-to-cart");
    By GoToCard = By.className("shopping_cart_container");
    By Checkoutbtn = By.id("checkout");
    By FristNameField = By.id("first-name");
    By LastNameField = By.id("last-name");
    By PostalCodeField = By.id("postal-code");
    By ContinueBtn = By.id("continue");
    //By CheckOutOverviewNotification = By.xpath("//span[text()=\"Checkout: Overview\"]");
    By FinishBTN = By.id("finish");
    //By ThanksforCompleteOrder = By.xpath("//h2[text()=\"Thank you for your order!\"]");


    public void Buyprodcuct()
   {

       driver.findElement(addtocart).click();
       driver.findElement(GoToCard).click();
       driver.findElement(Checkoutbtn).click();
       driver.findElement(FristNameField).sendKeys("Dalia");
       driver.findElement(LastNameField).sendKeys("Nassar");
       driver.findElement(PostalCodeField).sendKeys("1234");
       driver.findElement(ContinueBtn).click();
       driver.findElement(FinishBTN).click();


   }


}
