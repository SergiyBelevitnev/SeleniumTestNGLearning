import base.BaseTest;
import base.Reporter;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginUkrnet;
import utils.ExcelUtil;

public class DaraDrivenTestExcel extends BaseTest {
    public static LoginUkrnet loginUkrnet;

    @BeforeMethod
            public void setUp() {
        openURL("https://www.ukr.net");
        loginUkrnet = new LoginUkrnet(getDriver());
        loginUkrnet.switchToFrame();

    }

    @DataProvider
    public Object[][] getLoginData() {
        Object data[][] = ExcelUtil.getTestData("login");
        return data;
    }

    @Test(dataProvider = "getLoginData")

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
