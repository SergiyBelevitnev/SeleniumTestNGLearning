import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.SeleniumDocumentationPage;
import preset.PageObjectSupplier;
import preset.URL;



import java.nio.channels.SelectableChannel;

import static preset.PageObjectSupplier.$;
import static preset.PageObjectSupplier.loadSiteUrl;

public class TestGeneric {


    @Test
//    @Parameters({"chrome"})


    public void testSearch() {
        SoftAssert softAssert = new SoftAssert();
        BaseTest.LaunchBrowser("chrome");
        loadSiteUrl(URL.TESTURL);

//        PageObjectSupplier.loadSiteUrl(URL.TESTURL);
        $(SeleniumDocumentationPage.class)
                .searchByText("text");
    }
}
