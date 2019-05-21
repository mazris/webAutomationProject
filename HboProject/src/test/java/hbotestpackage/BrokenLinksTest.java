package hbotestpackage;

import base.CommonAPI;
import hbopackage.BrokenLinksClass ;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenLinksTest extends CommonAPI {

    BrokenLinksClass  brookenLinks;

    String url = "https://www.hbo.com/";
    @BeforeMethod
    public void init(){
        brookenLinks = PageFactory.initElements(driver,BrokenLinksClass .class);
        driver.get(url);
    }

    @Test
    public void testCnnActivlinks() throws IOException {
        brookenLinks.testBrokenLinks();
    }


}



