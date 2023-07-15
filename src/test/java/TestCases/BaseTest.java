package TestCases;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest
{
    public static WebDriver driver;
    @Before()
    public void setupBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "Chromik/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @After()
    public void closeBrowser()
    {
        driver.quit();
    }
}
