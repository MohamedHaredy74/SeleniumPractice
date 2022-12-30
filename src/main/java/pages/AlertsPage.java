package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    public AlertsPage(WebDriver driver)
    {this.driver=driver;}


    By JsAlert=By.xpath(".//button[contains(text(),'Click for JS Alert')]");
    By JsConfirm=By.xpath(".//button[contains(text(),'Click for JS Confirm')]");
    By JsPrompt =By.xpath(".//button[contains(text(),'Click for JS Prompt')]");
    By resultMessage=By.id("result");

    public void triggerJsAlert()
    {driver.findElement(JsAlert).click();}
    public void triggerJsConfirm()
    {driver.findElement(JsConfirm).click();}
    public void triggerJsPrompt()
    {driver.findElement(JsPrompt).click();}

    public void alert_acceptJsAlert()
    {driver.switchTo().alert().accept();}
    public void alert_cancelJsAlert()
    {driver.switchTo().alert().dismiss();}
    public String alert_getText()
    {return driver.switchTo().alert().getText();}

    public void alert_setText(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResultMessage()
    {return driver.findElement(resultMessage).getText();}
















}
