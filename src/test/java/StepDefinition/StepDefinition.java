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

    @When("I open client portal Login Page")
    public void openStockbitLogin() throws InterruptedException {
        driver.get("https://client-portal-testing.stickearn.net/#/");
        Thread.sleep(7000);
    }

    @And("I validate client portal Login Page already open")
    public void validateStockbit() {
        driver.findElement(By.id("login-form_email")).isDisplayed();
        driver.findElement(By.id("login-form_password")).isDisplayed();
    }

    @And("I set email {string}")
    public void setEmail(String value) {
//        driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("login-form_email")).sendKeys(value);
    }

    @And("I set password {string}")
    public void setPassword(String value) {
//        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("login-form_password")).sendKeys(value);
    }

    @And("I click login button")
    public void clickLogin(){
        driver.findElement(By.cssSelector("btn-login > button")).click();
    }

    @Then("User success login")
    public void userSuccess() {
        driver.findElement(By.cssSelector("#campaign-6daddc81-3947-4155-bd6c-c589950d5c88 > div > div.item-info__name > div")).isDisplayed();

        driver.close();
        driver.quit();
    }
}