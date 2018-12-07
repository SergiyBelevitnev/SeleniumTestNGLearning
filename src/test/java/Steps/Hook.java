package Steps;

import BaseCucumber.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest()
    {

        System.out.println("Opening the browser : MOCK /n");
//        base.StepInfo = "FirefoxDriver";
    }

    @After
    public void TearDownTest()
    {
        System.out.println("Closing the browser : MOCK");
    }
}
