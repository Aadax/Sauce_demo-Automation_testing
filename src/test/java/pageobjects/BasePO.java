package pageobjects;
import org.openqa.selenium.WebDriver;

public abstract class BasePO
{
    protected final WebDriver driver;
    protected BasePO(WebDriver driver)
    {
        this.driver=driver;
    }
}
