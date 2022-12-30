package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HoverPage clickOnHoverLink()
    {
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public FileUploadPage clickFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public IFramePage clickIFrame()
    {
        clickLink("WYSIWYG Editor");
        return new IFramePage(driver);
    }

    public LoadingPage clickDynamicLoading()
    {
        clickLink("Dynamic Loading");
        return new LoadingPage(driver);
    }

    public WindowPage clickBuildMyCarApplication()
    {
        clickLink("Build My Car Application");
        return new WindowPage(driver);
    }
    private void clickLink(String link)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(link)));
        driver.findElement(By.linkText(link)).click();
    }

    public AlertsPage clickJavaScriptAlert()
    {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }



}
