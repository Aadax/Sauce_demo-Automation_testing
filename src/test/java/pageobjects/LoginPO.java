package pageobjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPO extends BasePO
{
    private final WaitUtils wait = new WaitUtils();
    private final By loginInput = By.id("user-name");
    private final By PasswordInput = By.id("password");
    private final By LoginButtonInput = By.id("login-button");
    public LoginPO(WebDriver driver)
    {
        super(driver);
    }
    public void enterLogin(String userName)
    {
        wait.waitForElementToBeVisible(loginInput, driver);
        driver.findElement(loginInput).sendKeys(userName);
    }

    public void enterPassword(String Password)
    {
        wait.waitForElementToBeVisible(PasswordInput, driver);
        driver.findElement(PasswordInput).sendKeys(Password);
    }
    public void clearLogin()
    {
        wait.waitForElementToBeVisible(loginInput, driver);
        driver.findElement(loginInput).clear();
    }

    public void clearPassword()
    {
        wait.waitForElementToBeVisible(PasswordInput, driver);
        driver.findElement(PasswordInput).clear();
    }

    public void verifyLogin(String expectedUsername)
    {
        wait.waitForElementToBeVisible(loginInput, driver);
        Assert.assertEquals(expectedUsername, driver.findElement(loginInput).getAttribute("value"));
    }
    public void verifyPassword(String expectedPassword)
    {
        wait.waitForElementToBeVisible(PasswordInput, driver);
        Assert.assertEquals(expectedPassword, driver.findElement(PasswordInput).getAttribute("value"));
    }

    public void Button()
    {
        wait.waitForElementToBeVisible(LoginButtonInput, driver);
        driver.findElement(LoginButtonInput).click();
    }
}
