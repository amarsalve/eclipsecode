package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPageTest {
WebDriver driver;

@Given("user is on register page")
public void user_is_on_register_page() {
    WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
    driver.get("https://wwww.facebook.com/reg");
}

@When("user enter valid \"Anjali\"and\"More\"and\"anjali@tcs.com\"")
public void user_enter_valid_anjali_and_more_and_anjali_tcs_com() {
   driver.findElement(By.name("firstname")).sendKeys("fname");
   driver.findElement(By.name("lasttname")).sendKeys("lname");
   driver.findElement(By.name("reg_email_")).sendKeys("uname");
}

@Then("user is on home page")
public void user_is_on_home_page() throws InterruptedException {
	Thread.sleep(8000);
	driver.quit();
  }
}
