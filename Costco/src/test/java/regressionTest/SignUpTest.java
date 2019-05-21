package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.SignUpClass;

public class SignUpTest extends CommonAPI {
    SignUpClass sigupobj;


    @BeforeMethod
    public void init() {

        sigupobj = PageFactory.initElements(driver, SignUpClass.class);
    }

    @Test(priority = 1)
    public void signuptest()
    {
        sigupobj.signup();
        sigupobj.setCreataccoun();
        sigupobj.inpemail("emailemaileamil");
        sigupobj.setinputpass("passpasspass");

    }
   @Test(priority = 2)
    public void singupuser(){
        sigupobj.signup();
        sigupobj.setCreataccoun();
        sigupobj.inpemail("emaipassemailpasssss");
        sigupobj.setinputpass("passpasspass");



   }





}