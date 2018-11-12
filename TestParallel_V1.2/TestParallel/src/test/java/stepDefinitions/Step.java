package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step {
	
	public WebDriver driver ;
	@Given("^Chrome is launched$")
	public void chrome_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("launching Chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harry\\workspace\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
	      
		
	    
	}

	@When("^Google URL is launched$")
	public void google_URL_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://google.com");
	    
	}

	@When("^Get the Google Title$")
	public void get_the_Google_Title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getTitle());
	}
	
	@And("^Bing URL is launched$")
	public void bing_URL_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://bing.com");
	}

	@And("^Get the Bing Title$")
	public void get_the_Bing_Title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getTitle());
	}

}
