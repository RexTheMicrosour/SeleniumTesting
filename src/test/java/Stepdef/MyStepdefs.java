package Stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyStepdefs {

    @And("I enter First name and Last Name")
    public void iEnterFirstNameAndLastName() {
        System.out.println("I enter First name and Last Name");
    }

    @And("I enter Email and I enter confirm email")
    public void iEnterEmailAndIEnterConfirmEmail() {
        System.out.println("I enter Email and I enter confirm email");
    }

    @And("I enter password and I enter confirm password")
    public void iEnterPasswordAndIEnterConfirmPassword() {
        System.out.println("I enter password and I enter confirm password");
    }

    @And("I click the Terms and condition checkbox")
    public void iClickTheTermsAndConditionCheckbox() {
        System.out.println("I click the Terms and condition checkbox");    }

    @And("I click the I Over {int} checkbox")
    public void iClickTheIOverCheckbox(int arg0) {
        System.out.println("I click the I Over {int} checkbox");
    }

    @And("I click the Code of Ethics and Conduct Checkbox")
    public void iClickTheCodeOfEthicsAndConductCheckbox() {
        System.out.println("I click the Code of Ethics and Conduct Checkbox");
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        System.out.println("I click the login button");
    }

    @Then("I see the user created page")
    public void iSeeTheUserCreatedPage() {
        System.out.println("I see the user created page");
    }
}
