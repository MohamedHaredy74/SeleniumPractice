package testcases;

import org.testng.annotations.Test;

public class MultibleWindowtest extends BaseTest{

    @Test
    public void testWindow()
    {
       var window= homePage.clickBuildMyCarApplication();
       window.switchToVisitUsWindow();
    }
}
