package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public final int expTime=3;
    public void waitForElementToBeVisible(final By locator, final WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(this.expTime))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitForElementToBeInvisible(final By locator, final WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(this.expTime))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}



