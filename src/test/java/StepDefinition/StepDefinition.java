package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;
    @Given("I open the browser")
    public void OpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open Stockbit Login Page")
    public void openStockbitLogin() throws InterruptedException {
        driver.get("https://stockbit.com/#/login");
        Thread.sleep(7000);
    }

    @When("I open Stockbit Register Page")
    public void openStockbitRegister() throws InterruptedException {
        driver.get("https://stockbit.com/#/register");
        Thread.sleep(7000);
    }

    @And("I validate Stockbit Login Page already open")
    public void validateStockbit() {
        driver.findElement(By.id("username")).isDisplayed();
        driver.findElement(By.id("password")).isDisplayed();
    }

    @And("I validate Stockbit register button")
    public void validateStockbitRegister() {
        driver.findElement(By.cssSelector("#form-register > div > a.loginlogin.register-email")).isDisplayed();
    }

    @And("I validate stockbit register page")
    public void validateStockbitRegisterPage() {
        driver.findElement(By.id("input-1")).isDisplayed();
    }

    @And("I set username {string}")
    public void setUsername(String value) {
//        driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("username")).sendKeys(value);
    }

    @And("I set name {string}")
    public void setName(String value) {
//        driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("input-1")).sendKeys(value);
    }

    @And("I set email {string}")
    public void setEmail(String value) {
//        driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("input-2")).sendKeys(value);
    }

    @And("I set password {string}")
    public void setPassword(String value) {
//        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys(value);
    }

    @And("I set registration username {string}")
    public void setRegUsername(String value) {
//        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("input-3")).sendKeys(value);
    }

    @And("I set registration password {string}")
    public void setregPassword(String value) {
//        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("input-4")).sendKeys(value);
    }

    @And("I set confirm registration password {string}")
    public void setConPassword(String value) {
//        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("input-5")).sendKeys(value);
    }

    @And("I click register page button")
    public void clickRegPage(){
        driver.findElement(By.cssSelector("#form-register > div > a.loginlogin.register-email")).click();
    }

    @And("I click login button")
    public void clickLogin(){
        driver.findElement(By.id("loginbutton")).click();
    }

    @And("I click register button")
    public void clickRegis(){
        driver.findElement(By.cssSelector("#form-register > div > input")).click();
    }

    @Then("User success login")
    public void userSuccess() {
        driver.findElement(By.cssSelector("#menu > div > div:nth-child(1) > div.trading-menu > a")).isDisplayed();

        driver.close();
        driver.quit();
    }

    @Then("User success register")
    public void userSuccessRegister() {
        driver.findElement(By.cssSelector("#loginwrapperx > div > div > div:nth-child(2) > form > div.loginshadow > input.loginlogin")).isDisplayed();

        driver.close();
        driver.quit();
    }
}