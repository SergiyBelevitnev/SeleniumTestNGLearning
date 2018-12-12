package preset;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import pageobject.SeleniumDocumentationPage;

import static base.BaseTest.getDriver;

public class PageObjectSupplier {

    public static <T> T $(Class<T> pageObject)
    {return
            ConstructorAccess.get(pageObject).newInstance();}

    public static SeleniumDocumentationPage loadSiteUrl(final URL url) {
        getDriver().get(url.toString());
        return $(SeleniumDocumentationPage.class);
    }

    public static SeleniumDocumentationPage loadSiteUrl(String url) {
        getDriver().get(url);
        return $(SeleniumDocumentationPage.class);
    }





    private PageObjectSupplier() {
    }
}


