package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String pathName)
    {
        driver.findElement(uploadField).sendKeys(pathName);  //
    }
    public void clickUploadButton()
    {
        driver.findElement(uploadButton).click();
    }
    public String getUploadMessage()
    {
        return driver.findElement(uploadedFile).getText();
    }



}
