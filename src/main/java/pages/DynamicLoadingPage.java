package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By message = By.cssSelector("#finish h4");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickStartButton()
    {
        driver.findElement(startBtn).click();
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
                }


    public String getTextMessage()
    {
        return driver.findElement(message).getText();
    }



}
