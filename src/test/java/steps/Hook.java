package steps;

import BaseCucumber.BaseUtil;
import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static base.BaseTest.LaunchBrowser;
import static base.BaseTest.getDriver;
import static base.BaseTest.openURL;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws InterruptedException {

        LaunchBrowser("chrome");
//        Thread.sleep(8000);
        openURL("https://www.ukr.net");


    }

    @After
    public void TearDownTest()
    {
//      getDriver().quit();


    }
}
