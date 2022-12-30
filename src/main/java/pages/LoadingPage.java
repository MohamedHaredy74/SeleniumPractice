package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoadingPage {
    private WebDriver driver;
    private By link =By.xpath("//a[contains(text(),'Example 1:')]");

    public LoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPage clickLink()
    {
        driver.findElement(link).click();
        return new DynamicLoadingPage(driver);
    }




}
