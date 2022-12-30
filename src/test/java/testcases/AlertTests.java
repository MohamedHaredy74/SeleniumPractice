package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertTests extends BaseTest{

    @Test(priority = 1)
    public void testAcceptAlert()
    {
      var alertPage= homePage.clickJavaScriptAlert();
      alertPage.triggerJsAlert();
      SoftAssert softAssert=new SoftAssert();
      softAssert.assertTrue(alertPage.alert_getText().contains("I am a JS Alert"));
      alertPage.alert_acceptJsAlert();
      softAssert.assertTrue(alertPage.getResultMessage().contains("You successfully clicked an alert"));
    }

    @Test (priority = 2)
    public void testCancelAlert()
    {
        var alertPage=homePage.clickJavaScriptAlert();
        alertPage.triggerJsConfirm();
        alertPage.alert_cancelJsAlert();
        Assert.assertTrue(alertPage.getResultMessage().contains("You clicked: Cancel"));
    }

    @Test(priority = 3)
    public void testSendTextToAlert()
    {
        var alertPage=homePage.clickJavaScriptAlert();
        alertPage.triggerJsPrompt();
        String text="automation";
        alertPage.alert_setText(text);
        alertPage.alert_acceptJsAlert();
        Assert.assertEquals(alertPage.getResultMessage(),"You entered: "+text ,"Wrong Message");
    }







}
