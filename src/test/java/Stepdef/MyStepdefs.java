package Stepdef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {
    WebDriver driver = new ChromeDriver(); // Running chrome as browser

    @And("I enter my date of birth")
    public void iEnterMyDateOfBirth() {
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount"); //The website you're visiting

        driver.manage().window().maximize();  //Opens the website in
        WebElement dateOfBirth=driver.findElement(By.id("dp"));  //Date of birth
        dateOfBirth.clear();
        dateOfBirth.sendKeys("28/03/2002");  //Date of birth
    }

    @And("I enter First name and Last Name")
    public void iEnterFirstNameAndLastName() {

        WebElement firstName=driver.findElement(By.id("member_firstname")); //User firstname
        WebElement lastName=driver.findElement(By.id("member_lastname")); // User Lastname
        firstName.clear();
        firstName.sendKeys("Alex"); //User firstname


        lastName.clear();
        lastName.sendKeys("Laursen");// User Lastname


    }




    @And("I enter Email and I enter confirm email")
    public void iEnterEmailAndIEnterConfirmEmail() {

        WebElement emailAdress=driver.findElement(By.id("member_emailaddress"));// User email adress
        WebElement confirmEmailAdress=driver.findElement(By.id("member_confirmemailaddress")); //Confirm user email
        emailAdress.clear();
        emailAdress.sendKeys("abcfff@gmail.com"); // User email


        confirmEmailAdress.clear();
        confirmEmailAdress.sendKeys("abcfff@gmail.com"); // confirm user email
    }


    @And("I enter password and I enter confirm password")
    public void iEnterPasswordAndIEnterConfirmPassword() {
        WebElement password=driver.findElement(By.name("Password")); // User password
        WebElement confirmpassword=driver.findElement(By.id("signupunlicenced_confirmpassword")); // Confirm user password
        password.clear();
        password.sendKeys("your_password"); // User password


        confirmpassword.clear();
        confirmpassword.sendKeys("your_password"); // Confirm user password
    }


    @And("I click the Terms and condition checkbox")
    public void iClickTheTermsAndConditionCheckbox() {
        WebElement acceptTerms=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div:nth-child(1) > label > span.box"));
        // Accept terms checkbox
        acceptTerms.click();    // Accept terms checkbox
    }


    @And("I click the I Over {int} checkbox")
    public void iClickTheIOverCheckbox(int arg0) {
        WebElement ageOver18=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div.md-checkbox.margin-top-10 > label > span.box"));
        // Accept that you are over 18 checkbox
        ageOver18.click(); // Accept that you are over 18 checkbox
    }


    @And("I click the Code of Ethics and Conduct Checkbox")
    public void iClickTheCodeOfEthicsAndConductCheckbox() {
        WebElement rules=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(7) > label > span.box"));
        // Accept rules checkbox
        rules.click();    // Accept rules checkbox
    }


    @And("I click the login button")
    public void iClickTheLoginButton() {
        WebElement login=driver.findElement(By.name("join")); // Login button
        login.click();// Login button
    }

}
