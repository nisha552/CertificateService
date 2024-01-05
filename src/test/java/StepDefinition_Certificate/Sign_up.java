package StepDefinition_Certificate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sign_up {
static WebDriver driver;
	
	//Sign Up with valid data
	@Given("user landing on certificate service sign In page")
	public void user_landing_on_certificate_service_sign_In_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();

	    options.addArguments("--remote-allow-origins=*");

	    driver= new ChromeDriver(options);
	    
	    driver.manage().window().maximize();
		
	    driver.get("http://localhost:4200/");    
	    
	   
	} 
	@And("User navigated to Sign Up page")
	public void user_navigated_to_sign_up_page() throws InterruptedException {
		
		 driver.findElement(By.xpath("//a[text()='Sign-up']")).click();
	   
	}

	@When("user enter valid details in {string}{string}{string}{string}{string} and {string}")
	public void user_enter_valid_details_in_and(String FirstName, String LastName, String UserName, String Email, String Password, String Confirmpassword) {
	    
		//FirstName
		WebElement fname= driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
		fname.sendKeys(FirstName);
		
		//LastName
		WebElement lname= driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
		lname.sendKeys(LastName);
		
		//userName
		WebElement uname= driver.findElement(By.xpath("//input[@formcontrolname='userName']"));
		uname.sendKeys(UserName);
		
		//Email
	    WebElement email= driver.findElement(By.xpath("//input[@formcontrolname='email']"));
	   email.sendKeys(Email); 
	   
	   //Password
	 	WebElement password= driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	    password.sendKeys(Password);
	   
	 	//Confirm Password
	 	WebElement Confirmpassword1= driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']"));
	 	Confirmpassword1.sendKeys(Confirmpassword);
	}

	@And("click on Sign Up")
	public void click_on_sign_up() {
		
		//submit button
		WebElement submit= driver.findElement(By.xpath("//button[@class='submit']"));
		 submit.click();
		 
		
	}

	
	@Then("User navigated to Sign In page")
	public void user_navigated_to_sign_in_page() {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='OK']"))).click();
		System.out.println("sign up successful");
		
	}	
}
