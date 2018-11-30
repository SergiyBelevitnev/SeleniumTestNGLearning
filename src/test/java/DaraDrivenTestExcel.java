import base.BaseTest;
import base.Reporter;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelUtil;

public class DaraDrivenTestExcel extends BaseTest {

    @BeforeMethod
            public void setUp() {
        LaunchBrowser("chrome");
        openURL("https://www.ukr.net");
        switchToFrame("//*[@id='login-frame-wraper']/iframe");

    }

    @DataProvider
    public Object[][] getLoginData() {
        Object data[][] = ExcelUtil.getTestData("login");
        return data;
    }

    @Test(dataProvider = "getLoginData")

    public void loginTest(String username, String password) {

        enterTextInTextField("//*[@id=\"id-input-login\"]", username);
        enterTextInTextField("//*[@id=\"id-input-password\"]", password);
        clickButton("/html/body/form/div[6]/button");
        goSleep(8000);

        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"id-logout\"]")).isDisplayed());

        if (isElementPresent(By.xpath("//*[@id=\"id-logout\"]"))) {
            Reporter.log("Username " + "'"+ username +"'" + " login test passed");
            BaseTest.getDriver().findElement(By.xpath("//*[@id=\"id-logout\"]")).click();
        } else Reporter.log("Username" + username + "login failed");

        getDriver().close();

    }

}
