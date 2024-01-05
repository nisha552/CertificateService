package StepDefinition_Certificate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sign_in {
static WebDriver driver;
	
	@Given("landing on certificate service sign In page")
	public void landing_on_certificate_service_sign_In_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();

	    options.addArguments("--remote-allow-origins=*");

	    driver= new ChromeDriver(options);
	    
	    driver.manage().window().maximize();
	   
	    driver.navigate().to("http://localhost:4200/");    
	    
	   
	} 
	
	@When("user enter {string} and {string}")
	public void user_enter_and(String Username, String Password) throws InterruptedException {
		
		//username
        
	    WebElement uname= driver.findElement(By.xpath("//input[@formcontrolname='userName']"));
	    uname.sendKeys(Username); 
	   
	   //Password
	 	WebElement password1= driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	    password1.sendKeys(Password);
	   
	}

	@And("Click on Sign in button")
	public void click_on_sign_in_button() throws InterruptedException {
		
		//sign in button
		
	 	WebElement Sign= driver.findElement(By.xpath("//button[text()='Sign-in']"));
	 	Sign.click();
		

	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		
		System.out.println("sign in successful");
	    driver.close();
	}

}
