package Steps;

import base.BaseTest;
import base.Reporter;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
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
        BaseTest.LaunchBrowser("chrome");
        BaseTest.openURL("https://www.ukr.net");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("I should see the userform page");
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

        List<User> users = new ArrayList<User>();
            users=table.asList(User.class);
//        List<User> users =new ArrayList<>();
//        users = table.asList(User.class);
        for (User user: users){
            System.out.println(user.username);
            System.out.println(user.password);

        }




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
