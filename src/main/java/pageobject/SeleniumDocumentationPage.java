package pageobject;

import base.BaseTest;
import org.openqa.selenium.By;

public class SeleniumDocumentationPage extends BaseTest {


    public By searchField = By.xpath("//*[@id=\"q\"]");

    public SeleniumDocumentationPage searchByText(String searchText) {
        goSleep(5000);

//        waitForPageLoaded();
        waitForElement(searchField);
        setText(searchField, searchText);
        return this;
    }
}
