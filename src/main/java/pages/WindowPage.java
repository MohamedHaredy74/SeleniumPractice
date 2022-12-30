package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowPage {

    private WebDriver driver;
    private By visitUsBtn=By.id("visitbutton");
    private By helpBtn=By.id("helpbutton");
    private By OnlineChatBtn=By.id("chatbutton");


    public WindowPage(WebDriver driver) {
        this.driver = driver;
    }


    public void iterateOnAllWindows() {
        String mainHandle= driver.getWindowHandle();
        driver.findElement(visitUsBtn).click();
        driver.switchTo().window(mainHandle);
        driver.findElement(helpBtn).click();
        driver.switchTo().window(mainHandle);
        driver.findElement(OnlineChatBtn).click();
        driver.switchTo().window(mainHandle);
        Set<String>handles=driver.getWindowHandles();
        for (String  handle:handles
             ) {

            System.out.println(handle);
        }

    }

    public void switchToVisitUsWindow()
    {
        String mainwindowhandle = driver.getWindowHandle();
        driver.findElement(visitUsBtn).click();
        driver.switchTo().window("VisitUsWindow");

        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println(text);
        driver.close();
        driver.switchTo().window(mainwindowhandle);
        driver.findElement(helpBtn).click();
    }
}