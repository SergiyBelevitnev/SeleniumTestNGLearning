package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUkrnet {
    public LoginUkrnet(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"id-input-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"id-input-password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/form/div[6]/button")
    private WebElement loginButton;


    @FindBy(xpath = "//*[@id='login-frame-wraper']/iframe")
    private WebElement loginFrame;

    @FindBy(xpath = "//*[@id=\"id-logout\"]")
    public WebElement logoutButton;


    public void inputLogin(String username) {
        loginField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public  void switchToFrame(){
        driver.switchTo().frame(loginFrame);
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
}
