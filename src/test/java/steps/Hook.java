package steps;

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


    }

    @After
    public void TearDownTest()
    {

    }
}
