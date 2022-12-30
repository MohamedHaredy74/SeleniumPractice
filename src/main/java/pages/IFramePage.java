package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {
    private WebDriver driver;
    private String IFrameID="mce_0_ifr";
    private By BoldBtn=By.xpath("//button[@title='Bold']");

    By textArea = By.id("tinymce");


    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }
    private void switchToIFrame()
    {
        driver.switchTo().frame(IFrameID);
    }
    private void switchToMainFrame()
    {
        driver.switchTo().parentFrame();
    }
    public void clearEditor()
    {
        switchToIFrame();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }

    public void sendTextToEditor(String text)
    {
        switchToIFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }

    public void clickBoldBtn()
    {
        driver.findElement(BoldBtn).click();
    }
    public String getEditorText()
    {
        switchToIFrame();
        String text=driver.findElement(textArea).getText();
        switchToMainFrame();
       return text;

    }


}
