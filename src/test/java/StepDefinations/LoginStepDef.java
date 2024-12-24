package StepDefinations;

import Pages.LoginPage;
import Utility.BrowserUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.io.IOException;

public class LoginStepDef extends BrowserUtility {
    LoginPage loginPage = new LoginPage();
    BrowserUtility browserUtility = new BrowserUtility();
    @Given("login to the prestashop")
    public void login_to_the_prestashop() throws IOException {
        System.out.println("Login Step");
        loginPage.loginSetUp();
    }
    @When("Wait for the Cookie Pop")
    public void wait_for_the_cookie_pop() throws InterruptedException {
        System.out.println("Wait for Cookie");
        Thread.sleep(7000);
    }
    @When("handle teh Cookie Pop")
    public void handle_teh_cookie_pop() {
        browserUtility.handlePopUp("accept",null);
        System.out.println("Handle Cookie");
    }
    @Then("user landed to home Page")
    public void user_landed_to_home_page() {
        System.out.println("Logout");
       // loginPage.tearDown();

    }

}