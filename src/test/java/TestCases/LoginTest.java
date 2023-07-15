package TestCases;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageobjects.LoginPO;

public class LoginTest extends BaseTest
{
    LoginPO loginObject;
    LoginPO PasswordObject;
    LoginPO LoginButtonObject;
    @Before
    //Błąd byl tutaj to znaczy, jak stworzyłem nową metodę setupPassword to jej nie czytalo
    //Po dodaniu Password Object do metody setupPassword to zaczelo smigac, dlaczego?
    public void setupUsername()
    {
        loginObject = new LoginPO(driver);
        PasswordObject = new LoginPO(driver);
        LoginButtonObject = new LoginPO(driver);
    }

    @Test
    public void LoginCheck() throws InterruptedException
    {
        loginObject.enterLogin("standard_user");
        PasswordObject.enterPassword("secret_sauce");
        Thread.sleep(2000);
        loginObject.verifyLogin("standard_user");
        PasswordObject.verifyPassword("secret_sauce");
        LoginButtonObject.Button();
    }

    @After
    public void ValidationLogin() throws InterruptedException
    {
        Thread.sleep(6000);
    }
}
