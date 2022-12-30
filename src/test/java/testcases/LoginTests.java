package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends  BaseTest{

    @Test
    public void testSuccessLogin()
    {
     var loginpage= homePage.clickFormAuthentication();
     loginpage.loginWithValidData();
     Assert.assertTrue(loginpage.getOutMessage().contains("You logged into a secure area!"));
    }
}
