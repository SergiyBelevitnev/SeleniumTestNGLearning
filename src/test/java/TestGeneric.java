import base.BaseTest;
import base.EnumsTest;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.SeleniumDocumentationPage;
import preset.PageObjectSupplier;
import preset.URL;
import utils.PropUtils;


import java.nio.channels.SelectableChannel;

import static preset.PageObjectSupplier.$;
import static preset.PageObjectSupplier.loadSiteUrl;

public class TestGeneric extends  BaseTest {


//    @Parameters({"chrome"})
    @Parameters({"UrlUrl"})
    @Test
//    @Parameters({"chrome"})


    public void testSearch(String UrlUrl) {


        SoftAssert softAssert = new SoftAssert();
        BaseTest.LaunchBrowser("chrome");

        String url = EnumsTest.UrlUrl.valueOf(UrlUrl).getValue();



//        EnumsTest.UrlUrl str3 = EnumsTest.UrlUrl;

        System.out.println(url);

        loadSiteUrl(url);

        waitUntilElementBeVisible(By.xpath("//*[@id=\"q\"]"));
        $(SeleniumDocumentationPage.class)
                .searchByText("text");
    }
}
