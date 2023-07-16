package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;
import java.util.List;

public class ProductsPO extends BasePO {
    private final By ProductsObject = By.className("add-to-cart-sauce-labs-backpack");
    public ProductsPO(WebDriver driver)
    {
        super(driver);
    }
    private final WaitUtils wait = new WaitUtils();
    public void CountObjects() throws InterruptedException {

        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ProductsObject));
        Thread.sleep(3000);
        List<WebElement>products=driver.findElements(By.className("add-to-cart-sauce-labs-backpack"));
        System.out.println("Amount of products: " + products.size());
    }

/*    public void VerifyCounter()
    {
        wait.waitForElementToBeVisible(ProductObject, driver);
        Assert.assertEquals(expectedUsername, driver.findElement(ProductsObject).getAttribute("value"));
    }
*/
}