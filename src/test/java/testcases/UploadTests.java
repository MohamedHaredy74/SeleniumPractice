package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends BaseTest{

    @Test
    public void testUploading(){
        var uploadPage= homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\hared\\OneDrive\\Desktop\\mohamed.jpg");
        uploadPage.clickUploadButton();
        Assert.assertEquals(uploadPage.getUploadMessage(),"mohamed.jpg");
    }

}
