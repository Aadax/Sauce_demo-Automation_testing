package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

import java.util.List;

public class ProductsPO extends BasePO {
    private final By ProductsObject = By.cssSelector("btn btn_primary btn_small btn_inventory");
    public ProductsPO(WebDriver driver)
    {
        super(driver);
    }
    private final WaitUtils wait = new WaitUtils();
    //private final By AddToCard = By.cssSelector("btn btn_primary btn_small btn_inventory");
    public void CountObjects()
    {
        //wait.waitForElementToBeVisible(AddToCard,driver);
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ProductsObject));
        List<WebElement>products=driver.findElements(By.cssSelector("button.btn.btn_primary.btn_small.btn_inventory"));
        int numberOfProducts = products.size();
        System.out.println("Liczba produktów: " + numberOfProducts);
    }
//    public void VerifyCounter()
//    {
//        wait.waitForElementToBeVisible(ProductsObject, driver);
//        Assert.assertEquals(expectedUsername, driver.findElement(ProductsObject).getAttribute("value"));
//    }
}
