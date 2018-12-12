package testMethods;

import pageobject.SeleniumDocumentationPage;

public class SeleniumDocumentationMethods extends SeleniumDocumentationPage {


    public SeleniumDocumentationMethods searchByText(String searchText) {

//        waitForPageLoaded();
        waitForElement(searchField);
        setText(searchField, searchText);
        return this;
    }


}
