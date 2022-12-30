package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FluentWaitTests extends BaseTest{

    @Test
    public void testFluentWait()
    {
       var L = homePage.clickDynamicLoading();
       var loadingPage=L.clickLink();
       loadingPage.clickStartButton();
        Assert.assertTrue(loadingPage.getTextMessage().contains("Hello World!"));


    }
}
