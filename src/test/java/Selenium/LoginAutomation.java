package Selenium;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginAutomation {
    @Test

    public void createUser() {

        WebDriver driver = new ChromeDriver(); // Running chrome as browser

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount"); //The website you're visiting

        driver.manage().window().maximize();  //Opens the website in fullscreen

        WebElement dateOfBirth=driver.findElement(By.id("dp"));  //Date of birth

        WebElement firstName=driver.findElement(By.id("member_firstname")); //User firstname
        WebElement lastName=driver.findElement(By.id("member_lastname")); // User Lastname

        WebElement emailAdress=driver.findElement(By.id("member_emailaddress")); // User email adress
        WebElement confirmEmailAdress=driver.findElement(By.id("member_confirmemailaddress")); //Confirm user email

        WebElement password=driver.findElement(By.name("Password")); // User password
        WebElement confirmpassword=driver.findElement(By.id("signupunlicenced_confirmpassword")); // Confirm user password

        WebElement acceptTerms=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div:nth-child(1) > label > span.box"));
        // Accept terms checkbox

        WebElement ageOver18=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div.md-checkbox.margin-top-10 > label > span.box"));
        // Accept that you are over 18 checkbox

        WebElement rules=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(7) > label > span.box"));
        // Accept rules checkbox

        WebElement login=driver.findElement(By.name("join")); // Login button

        dateOfBirth.clear();
        dateOfBirth.sendKeys("28/03/2002");  //Date of birth

        firstName.clear();
        firstName.sendKeys("Alex"); //User firstname

        lastName.clear();
        lastName.sendKeys("Laursen");// User Lastname

        emailAdress.clear();
        emailAdress.sendKeys("abcdcfc@gmail.com"); // User email adress

        confirmEmailAdress.clear();
        confirmEmailAdress.sendKeys("abcdcfc@gmail.com"); //Confirm user email

        password.clear();
        password.sendKeys("your_password"); // User password

        confirmpassword.clear();
        confirmpassword.sendKeys("your_password"); // Confirm user password

        acceptTerms.click();    // Accept terms checkbox

        ageOver18.click(); // Accept that you are over 18 checkbox

        rules.click();    // Accept rules checkbox

        login.click();// Login button

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


    }
    @Test
    public void lastNameMissing(){

        WebDriver driver = new ChromeDriver(); // Running chrome as browser

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount"); //The website you're visiting

        driver.manage().window().maximize(); //Opens the website in fullscreen

        WebElement dateOfBirth=driver.findElement(By.id("dp")); //Date of birth

        WebElement firstName=driver.findElement(By.id("member_firstname")); //User firstname

        WebElement emailAdress=driver.findElement(By.id("member_emailaddress"));// User email adress
        WebElement confirmEmailAdress=driver.findElement(By.id("member_confirmemailaddress")); //Confirm user email

        WebElement password=driver.findElement(By.name("Password"));  // User password
        WebElement confirmpassword=driver.findElement(By.id("signupunlicenced_confirmpassword")); // Confirm user password

        WebElement acceptTerms=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div:nth-child(1) > label > span.box"));
        // Accept terms checkbox

        WebElement ageOver18=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div.md-checkbox.margin-top-10 > label > span.box"));
        // Accept that you are over 18 checkbox

        WebElement rules=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(7) > label > span.box"));
        // Accept rules checkbox

        WebElement login=driver.findElement(By.name("join")); //Login button

        dateOfBirth.clear();
        dateOfBirth.sendKeys("28/03/2002"); //Date of birth

        firstName.clear();
        firstName.sendKeys("Alex"); // User Firstname

        emailAdress.clear();
        emailAdress.sendKeys("abc@gmail.com"); // User email

        confirmEmailAdress.clear();
        confirmEmailAdress.sendKeys("abc@gmail.com"); // confirm user email

        password.clear();
        password.sendKeys("your_password"); // User password

        confirmpassword.clear();
        confirmpassword.sendKeys("your_password"); // confirm user password

        acceptTerms.click();    // Accept terms checkbox

        ageOver18.click(); // Accept that you are over 18 checkbox

        rules.click();    // Accept rules checkbox

        login.click();// Login button

        String actualUrl="https://membership.basketballengland.co.uk/NewSupporterAccount";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Test
    public void password(){

        WebDriver driver = new ChromeDriver(); // Running chrome as browser

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount"); //The website you're visiting

        driver.manage().window().maximize();  //Opens the website in fullscreen

        WebElement dateOfBirth=driver.findElement(By.id("dp"));  //Date of birth

        WebElement firstName=driver.findElement(By.id("member_firstname")); //User firstname
        WebElement lastName=driver.findElement(By.id("member_lastname")); // User Lastname

        WebElement emailAdress=driver.findElement(By.id("member_emailaddress")); // User email adress
        WebElement confirmEmailAdress=driver.findElement(By.id("member_confirmemailaddress")); //Confirm user email

        WebElement password=driver.findElement(By.name("Password")); // User password
        WebElement confirmpassword=driver.findElement(By.id("signupunlicenced_confirmpassword")); // Confirm user password

        WebElement acceptTerms=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div:nth-child(1) > label > span.box"));
        // Accept terms checkbox

        WebElement ageOver18=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div.md-checkbox.margin-top-10 > label > span.box"));
        // Accept that you are over 18 checkbox

        WebElement rules=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(7) > label > span.box"));
        // Accept rules checkbox

        WebElement login=driver.findElement(By.name("join")); // Login button

        dateOfBirth.clear();
        dateOfBirth.sendKeys("28/03/2002");  //Date of birth

        firstName.clear();
        firstName.sendKeys("Alex"); //User firstname

        lastName.clear();
        lastName.sendKeys("Laursen");// User Lastname

        emailAdress.clear();
        emailAdress.sendKeys("abcdcfg@gmail.com"); // User email adress

        confirmEmailAdress.clear();
        confirmEmailAdress.sendKeys("abcdcfg@gmail.com"); //Confirm user email

        password.clear();
        password.sendKeys("your_password"); // User password

        acceptTerms.click();    // Accept terms checkbox

        ageOver18.click(); // Accept that you are over 18 checkbox

        rules.click();    // Accept rules checkbox

        confirmpassword.clear();
        confirmpassword.sendKeys("your_passworde"); // Confirm user password

        login.click();// Login button

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Test
    public void termsAndConditions(){

        WebDriver driver = new ChromeDriver(); // Running chrome as browser

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount"); //The website you're visiting

        driver.manage().window().maximize();  //Opens the website in fullscreen

        WebElement dateOfBirth=driver.findElement(By.id("dp"));  //Date of birth

        WebElement firstName=driver.findElement(By.id("member_firstname")); //User firstname
        WebElement lastName=driver.findElement(By.id("member_lastname")); // User Lastname

        WebElement emailAdress=driver.findElement(By.id("member_emailaddress")); // User email adress
        WebElement confirmEmailAdress=driver.findElement(By.id("member_confirmemailaddress")); //Confirm user email

        WebElement password=driver.findElement(By.name("Password")); // User password
        WebElement confirmpassword=driver.findElement(By.id("signupunlicenced_confirmpassword")); // Confirm user password

        WebElement ageOver18=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(2) > div.md-checkbox.margin-top-10 > label > span.box"));
        // Accept that you are over 18 checkbox

        WebElement rules=driver.findElement(By.cssSelector("#signup_form > div:nth-child(12) > div > div:nth-child(7) > label > span.box"));
        // Accept rules checkbox

        WebElement login=driver.findElement(By.name("join")); // Login button

        dateOfBirth.clear();
        dateOfBirth.sendKeys("28/03/2002");  //Date of birth

        firstName.clear();
        firstName.sendKeys("Alex"); //User firstname

        lastName.clear();
        lastName.sendKeys("Laursen");// User Lastname

        emailAdress.clear();
        emailAdress.sendKeys("abcdc@gmail.com"); // User email adress

        confirmEmailAdress.clear();
        confirmEmailAdress.sendKeys("abcdc@gmail.com"); //Confirm user email

        password.clear();
        password.sendKeys("your_password"); // User password

        confirmpassword.clear();
        confirmpassword.sendKeys("your_password"); // Confirm user password

        ageOver18.click(); // Accept that you are over 18 checkbox

        rules.click();    // Accept rules checkbox

        login.click();// Login button

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


    }
}