package preset;

import base.BaseTest;
import com.esotericsoftware.reflectasm.ConstructorAccess;

public class PageObjectSupplier {


    public static <T> T $(Class<T> pageObject) {
        return ConstructorAccess.get(pageObject).newInstance();
    }

    public static void loadSiteUrl(final URL url) {
        BaseTest.getDriver().get(url.toString());
    }

    public static void loadSiteUrl(final String url) {
        BaseTest.getDriver().get(url);
    }

    private PageObjectSupplier() {
    }
}
