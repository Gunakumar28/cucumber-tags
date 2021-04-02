package step.defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.clas.LibGlobal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass extends LibGlobal {
	
	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		
	}

	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("govindasrini");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("srini123");
	}

	@When("user should clik login button")
	public void user_should_clik_login_button() {
		 WebElement findElement = driver.findElement(By.xpath("//*[@id='login']"));
		   boolean enabled = findElement.isEnabled();
		   findElement.click();
	}

	@Then("user should verify sucess message.")
	public void user_should_verify_sucess_message() {
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("https://adactinhotelapp.com/SearchHotel.php");
		Assert.assertTrue("verified that username and password", contains);
		 
	}

	@When("user is on the search hotel page")
	public void user_is_on_the_search_hotel_page() {
		WebElement findElement = driver.findElement(By.xpath("//*[@id='location']"));
		   Select select= new Select(findElement);
		   select.selectByVisibleText("Melbourne");
	}

	@When("user should enter valid credentials")
	public void user_should_enter_valid_credentials() {
		WebElement findElement = driver.findElement(By.xpath("//*[@id='hotels']"));
	    Select select = new Select(findElement);
	    select.selectByVisibleText("Hotel Sunshine");
	    WebElement findElement2 = driver.findElement(By.xpath("//*[@id='room_type']"));
	    Select select2 = new Select(findElement2);
	    select2.selectByVisibleText("Double");
	    WebElement findElement3 = driver.findElement(By.xpath("//*[@id='room_nos']"));
	    Select select3 = new Select(findElement3);
	    select3.selectByVisibleText("3 - Three");
	    WebElement findElement4 = driver.findElement(By.xpath("//*[@id='adult_room']"));
	    Select select4 = new Select(findElement4);
	    select4.selectByVisibleText("3 - Three");
	}

	@When("user should click on search button")
	public void user_should_click_on_search_button() {
		   driver.findElement(By.xpath("//*[@id='Submit']")).submit();

	}

	@Then("user should verify succes message.")
	public void user_should_verify_succes_message() {
		 String currentUrl = driver.getCurrentUrl();
		   boolean contains = currentUrl.contains("SelectHotel");
		   Assert.assertTrue("verified search hotel",contains );
		   
	}

	@When("user should click on radio button or hotel select button")
	public void user_should_click_on_radio_button_or_hotel_select_button() {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	}

	@When("user should click on continue button")
	public void user_should_click_on_continue_button() {
		WebElement findElement = driver.findElement(By.xpath("//*[@id='continue']"));
		   findElement.click();
	}

	@Then("user verify the succes message and navigate to next page.")
	public void user_verify_the_succes_message_and_navigate_to_next_page() {
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("BookHotel");
		Assert.assertTrue("verified hotel select page",contains );
		
	}

	@When("user should be enter firstname,Lastname,billing address,Creditcard type,Expirydate,Cvv number")
	public void user_should_be_enter_firstname_Lastname_billing_address_Creditcard_type_Expirydate_Cvv_number() {
		 driver.findElement(By.id("first_name")).sendKeys("rajini");
		    driver.findElement(By.id("last_name")).sendKeys("khath");
		    driver.findElement(By.xpath("//*[@id='address']")).sendKeys("ADYAR\r\n" + 
		    		"No.11, First Street,\r\n" + 
		    		"Padmanabha Nagar,\r\n" + 
		    		"Adyar, Chennai\r\n" + 
		    		"\r\n" + 
		    		"+91 - 89399 15577");
		    WebElement findElement = driver.findElement(By.xpath("//*[@id='cc_type']"));
		    Select select = new Select(findElement);
		    select.selectByVisibleText("American Express");
		    WebElement findElement2 = driver.findElement(By.xpath("//*[@id='cc_exp_month']"));
		    Select select2 = new Select(findElement2);
		    select2.selectByVisibleText("March");
		    WebElement findElement3 = driver.findElement(By.xpath("//*[@id='cc_exp_year']"));
		    Select select3 = new Select(findElement3);
		    select3.selectByVisibleText("2014");
		    driver.findElement(By.xpath("//*[@id='cc_cvv']")).sendKeys("885");
		    driver.findElement(By.xpath("//*[@id='book_now']")).click();
		    String text = driver.findElement(By.xpath("//label[text()='Please Enter your 16 Digit Credit Card Number']")).getText();
		    System.out.println(text);
	}

	@Then("user should verify the error msg without enter Creditcard number.")
	public void user_should_verify_the_error_msg_without_enter_Creditcard_number() {
		 String currentUrl = driver.getCurrentUrl();
		   boolean contains = currentUrl.contains("BookHotel");
		   Assert.assertTrue("verified book a hotel page", contains);
		   
	}

	@When("user should be enter firstname,Lastname,billing address,Creditcard number,Expirydate,Cvv number")
	public void user_should_be_enter_firstname_Lastname_billing_address_Creditcard_number_Expirydate_Cvv_number() {
		driver.findElement(By.xpath("//*[@id='cc_num']")).sendKeys("1234567891234567");
		   WebElement findElement2 = driver.findElement(By.xpath("//*[@id='cc_exp_month']"));
		    Select select2 = new Select(findElement2);
		    select2.selectByVisibleText("March");
		    WebElement findElement3 = driver.findElement(By.xpath("//*[@id='cc_exp_year']"));
		    Select select3 = new Select(findElement3);
		    select3.selectByVisibleText("2014");
		    driver.findElement(By.xpath("//*[@id='cc_cvv']")).sendKeys("885");
		    driver.findElement(By.xpath("//*[@id='book_now']")).click();
		    String text = driver.findElement(By.xpath("//*[text()='Please Select your Credit Card Type']")).getText();
		    System.out.println(text);
	}

	@Then("user should verify the error msg without select Creditcard type.")
	public void user_should_verify_the_error_msg_without_select_Creditcard_type() {
		String currentUrl = driver.getCurrentUrl();
		   boolean contains = currentUrl.contains("BookHotel");
		   Assert.assertTrue("verified book a hotel page ", contains);
		   
	}

	@When("user should be enter firstname,Lastname,billing address,Creditcard number,Creditcard type,Cvv number")
	public void user_should_be_enter_firstname_Lastname_billing_address_Creditcard_number_Creditcard_type_Cvv_number() {
		 driver.findElement(By.xpath("//*[@id='cc_num']")).sendKeys("1234567891234567");
		   WebElement findElement = driver.findElement(By.xpath("//*[@id='cc_type']"));
		    Select select = new Select(findElement);
		    select.selectByVisibleText("American Express");
		    driver.findElement(By.xpath("//*[@id='cc_cvv']")).sendKeys("885");
		    driver.findElement(By.xpath("//*[@id='book_now']")).click();
		    String text = driver.findElement(By.xpath("//*[text()='Please Select your Credit Card Expiry Month']")).getText();
		    System.out.println(text);
	}

	@Then("user should verify the error msg without enter Expirydate.")
	public void user_should_verify_the_error_msg_without_enter_Expirydate() {
		String currentUrl = driver.getCurrentUrl();
		   boolean contains = currentUrl.contains("BookHotel");
		   Assert.assertTrue("verified book a hotel page ", contains);
		   
	}

	@When("user should be enter firstname,Lastname,billing address,Creditcard number,Creditcard type,Expirydate")
	public void user_should_be_enter_firstname_Lastname_billing_address_Creditcard_number_Creditcard_type_Expirydate() {
		driver.findElement(By.xpath("//*[@id='cc_num']")).sendKeys("1234567891234567");
		   WebElement findElement = driver.findElement(By.xpath("//*[@id='cc_type']"));
		    Select select = new Select(findElement);
		    select.selectByVisibleText("American Express");
		    WebElement findElement2 = driver.findElement(By.xpath("//*[@id='cc_exp_month']"));
		    Select select2 = new Select(findElement2);
		    select2.selectByVisibleText("March");
		    WebElement findElement3 = driver.findElement(By.xpath("//*[@id='cc_exp_year']"));
		    Select select3 = new Select(findElement3);
		    select3.selectByVisibleText("2014");
		    driver.findElement(By.xpath("//*[@id='book_now']")).click();
		    String text = driver.findElement(By.xpath("//*[text()='Please Enter your Credit Card CVV Number']")).getText();
		    System.out.println(text);

	}

	@Then("user should verify the error msg without enter CVV number.")
	public void user_should_verify_the_error_msg_without_enter_CVV_number() {
		String currentUrl = driver.getCurrentUrl();
	    boolean contains = currentUrl.contains("BookHotel");
	    Assert.assertTrue("verified book a hotel page", contains);
	    
	}

	

}
