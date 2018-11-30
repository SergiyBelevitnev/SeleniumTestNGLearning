import base.BaseTest;
import base.Reporter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobject.LoginUkrnet;
import utils.ExcelUtil;

import static base.BaseTest.getDriver;
//https://github.com/SergiyBelevitnev/SeleniumLearning.git


public class DataDrivenTestNG extends BaseTest {
    public static LoginUkrnet loginUkrnet;
    @BeforeMethod
    public void setUp() {
        openURL("https://www.ukr.net");
        loginUkrnet = new LoginUkrnet(getDriver());
        loginUkrnet.switchToFrame();

    }

    @DataProvider (name="TestData")
    public Object[][] getTestNGData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "belevitnev";
        data[0][1] = "3109703178";

        data[1][0] = "belevitnevalv";
        data[1][1] = "3109703178";

        data[2][0] = "belevitnevaov";
        data[2][1] = "3109703178";

        return data;
    }

    @Test(dataProvider = "TestData")

    public void loginTest(String username, String password) {


        loginUkrnet.inputLogin(username);
        loginUkrnet.inputPassword(password);
        loginUkrnet.clickLoginButton();

        goSleep(1000);

        Assert.assertTrue(loginUkrnet.logoutButton.isDisplayed());
        loginUkrnet.clickLogoutButton();
        Reporter.log("Username " + "'"+ username +"'" + " login test passed");

    }

}
