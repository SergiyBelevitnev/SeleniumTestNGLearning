package Steps;

import BaseCucumber.BaseUtil;
import base.BaseTest;
import base.Reporter;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pageobject.LoginUkrnet;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseTest {
    public static LoginUkrnet loginUkrnet;

    public static void setUp(){
        LaunchBrowser("chrome");
        openURL("https://www.ukr.net");
        loginUkrnet = new LoginUkrnet(getDriver());
        loginUkrnet.switchToFrame();


//    loginUkrnet.switchToFrame();
    }

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @And("^I enter the username as admin and password as password$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        Reporter.log("I enter the username as admin and password as admin");
        System.out.println("I enter the username as admin and password as admin");
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("I OPEN login PAGE");
//        BaseTest.LaunchBrowser("chrome");
//        BaseTest.openURL("https://www.ukr.net");
        setUp();

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("I click login button");
        loginUkrnet.clickLoginButton();
        Thread.sleep(2000);
//        loginUkrnet.clickLogoutButton();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
//        loginUkrnet.switchToFrame();
//
       Assert.assertTrue(loginUkrnet.logoutButton.isDisplayed());
        loginUkrnet.clickLogoutButton();

    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("!!!!I enter the username as admin and password as admin");
//        throw new PendingException();
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {


//        List<List<String>> data =  table.raw();
//
//
//        System.out.println(data.get(0).get(0));
//        System.out.println(data.get(0).get(1));
//        System.out.println(data.get(1).get(0));
//        System.out.println(data.get(1).get(1));
//        System.out.println(data.get(2).get(0));
//        System.out.println(data.get(2).get(1));

        List<User> users;
            users=table.asList(User.class);
//        List<User> users =new ArrayList<>();
//        users = table.asList(User.class);
        for (User user: users){
            loginUkrnet.inputLogin(user.username);
            loginUkrnet.inputPassword(user.password);




//            System.out.println(user.username);
//            System.out.println(user.password);

        }




    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName is: " + userName);
        System.out.println("Password is: " + password);
    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
