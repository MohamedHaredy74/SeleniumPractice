package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By form =By.id("login");
    private By userName =By.id("username");
    private By password =By.id("password");
    private By loginBtn =By.tagName("button");
    private By message = By.id("flash");
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void loginWithValidData()
    {
        WebElement Form = driver.findElement(form);
        Form.findElement(userName).sendKeys("tomsmith");
        Form.findElement(password).sendKeys("SuperSecretPassword!");
        Form.findElement(loginBtn).submit();

    }

    public String getOutMessage()
    {
        return driver.findElement(message).getText();
    }



}
