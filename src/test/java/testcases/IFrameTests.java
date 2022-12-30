package testcases;

import org.testng.annotations.Test;

public class IFrameTests extends BaseTest{

    @Test
    public void testSendTextToFrame()
    {
        var IFrame = homePage.clickIFrame();
        IFrame.clearEditor();
        IFrame.sendTextToEditor("hello");
        IFrame.clickBoldBtn();
        IFrame.sendTextToEditor(" world");
        String text =IFrame.getEditorText();
        System.out.println(text);





    }
}
