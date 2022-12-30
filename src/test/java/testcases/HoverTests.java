package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest{

    @Test
    public void testHoverLink()
    {
        var hoverPage = homePage.clickOnHoverLink();
        var caption = hoverPage.hoverOverFigure(3);
        System.out.println(caption.getHeaderMessage());
        Assert.assertTrue(caption.isCaptionDisplayed());
        Assert.assertEquals(caption.getLinkText(),"View profile","linkTextIsincorrect");

    }


}
