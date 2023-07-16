package TestCases;

import org.junit.Before;
import org.junit.Test;
import pageobjects.ProductsPO;

public class ProductsTest extends BaseTest
{
    ProductsPO ProductObject;
    @Before
    public void setupProducts()
    {
        ProductObject = new ProductsPO(driver);
    }
    @Test
    public void ProductCounter() throws InterruptedException
    {
     ProductObject.CountObjects();
    }
}
