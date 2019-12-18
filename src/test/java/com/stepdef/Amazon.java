package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pf.Amazonpf;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazon {

	WebDriver driver;
	Amazonpf a;

	
	@Given("^Uer able to open any browser$")
	public void uer_able_to_open_any_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "/Users/anaskhan/eclipse-workspace/Amazon/Driver/chromedriver");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
	}

	@Given("^Log in with valid credentials$")
	public void log_in_with_valid_credentials() throws Throwable {
		driver.get("https://www.amazon.com");
	    a = PageFactory.initElements(driver, Amazonpf.class);
	   a.getSign().click();
	   a.getEmail().sendKeys("talentech222@gmail.com");
	   a.getContinue().click();
	   a.getPassword().sendKeys("student123");
	   a.getSignIn().click();
	   
	}

	@Then("^Validate amazon home page$")
	public void validate_amazon_home_page() throws Throwable {
	   
		if (a.getAmazon().getText().equalsIgnoreCase("Amazon")) {
			System.out.println("Got the Amazon Home Page:: " + a.getAmazon().getText());
		} else {
			System.out.println("Test Failed>>>> Page Title:: " + a.getAmazon().getText());
		}
	   
	}

	@Then("^Search iphone$")
	public void search_iphone() throws Throwable {
	   
		a.getSearch1().sendKeys("iphone");
		a.getClickSearch1().click();
	   
	}

	@Then("^Sort iphone High to Low price$")
	public void sort_iphone_High_to_Low_price() throws Throwable {
	   
		a.getLH1().click();
		a.getChooseHL1().click();
		Thread.sleep(3000);
	}

	@Then("^Find all iphone and total iphone number \\(model x\\) in (\\d+)st page$")
	public void find_all_iphone_and_total_iphone_number_model_x_in_st_page(int arg1) throws Throwable {
	   
	   
	}

	@Then("^Find out total page number of iphone$")
	public void find_out_total_page_number_of_iphone() throws Throwable {
	   
	   
	}

	@Then("^Sort iphone Low to High price$")
	public void sort_iphone_Low_to_High_price() throws Throwable {
	   
		a.getLH1().click();
		a.getChooseLH1().click();
		Thread.sleep(2000);
	}

	@Then("^Find out highest and lowest price iphone X$")
	public void find_out_highest_and_lowest_price_iphone_X() throws Throwable {
	   
	   
	}

	@Then("^Add one iphone in cart$")
	public void add_one_iphone_in_cart() throws Throwable {
	   
		a.getPickiphone().click();
		Thread.sleep(2000);
		a.getAddtocart().click();
	   
	}

	@Then("^Search HP laptop$")
	public void search_HP_laptop() throws Throwable {
		a.getSearch1().sendKeys("HP laptop");
		a.getClickSearch1().click();
	   
	}

	@Then("^Sort laptop High to Low price$")
	public void sort_laptop_High_to_Low_price() throws Throwable {
	   
		a.getLH1().click();
		a.getChooseHL1().click();
		Thread.sleep(3000);
	   
	}

	@Then("^Find all laptop and total number display in page one$")
	public void find_all_laptop_and_total_number_display_in_page_one() throws Throwable {
	   
	   
	}

	@Then("^Find out total page number of laptop$")
	public void find_out_total_page_number_of_laptop() throws Throwable {
	   
	   
	}

	@Then("^Sort laptop Low to High price$")
	public void sort_laptop_Low_to_High_price() throws Throwable {
	   
		a.getLH1().click();
		a.getChooseLH1().click();
		Thread.sleep(2000);
	}

	@Then("^Find out highest and lowest price HP laptop$")
	public void find_out_highest_and_lowest_price_HP_laptop() throws Throwable {
	   
	   
	}

	@Then("^Add one laptop in cart$")
	public void add_one_laptop_in_cart() throws Throwable {
	   
		a.getPickhp().click();
		a.getAddtocart().click();
		Thread.sleep(2000);
	   
	}

	@Then("^Provide invalide payment information$")
	public void provide_invalide_payment_information() throws Throwable {
	  
		a.getCart().click();
		Thread.sleep(1000);
		a.getProceedtoCh().click();
		Thread.sleep(1000);
		a.getDeliver().click();
		Thread.sleep(1000);
		a.getContinueCh().click();
		Thread.sleep(1000);
		a.getCardname().sendKeys("talentech");
		Thread.sleep(1000);
		a.getCardnumber().sendKeys("123");
		Thread.sleep(1000);
		a.getAddcard().click();
		Thread.sleep(3000);
	
	   
	}

	@Then("^Validate payment failure$")
	public void validate_payment_failure() throws Throwable {
	   
		if (a.getBadCard().isDisplayed()) {
			System.out.println("PAYMENT FAILURE");
		} else {
			System.out.println("PAYMENT SUCCESS");
		}
	  
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   
		
		driver.quit();
	   
	}
	

	
	
}
