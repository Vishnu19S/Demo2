package org.Adactin_Login_StepDefinition;

import org.Adactin_Homepage_Pom.Adactin_Homepage_Pom;
import org.Adactin_Login_Cucumber_Base.Adactin_Login_Cucumber_Base;
import org.Adactin_Login_Cucumber_Pom.Adactin_Login_Cucumber_Pom;
import org.Adactin_Login_RunnerClass.Adactin_Login_RunnerClass;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Login_StepDefinition extends Adactin_Login_Cucumber_Base {

	public static WebDriver driver = Adactin_Login_RunnerClass.driver;
	public static Adactin_Login_Cucumber_Pom callpom = new Adactin_Login_Cucumber_Pom(driver);
	public static Adactin_Homepage_Pom homepom = new Adactin_Homepage_Pom(driver);

	@Given("I am going to Launching the URL")
	public void i_am_going_to_launching_the_url() {
		launchurl(driver, "https://adactinhotelapp.com/index.php");
	}
	@When("I am entering the username")
	public void i_am_entering_the_username() {
		username(callpom.getUsername(), "vishnu19S");
	}
	@When("I am entering the Password")
	public void i_am_entering_the_password() {
		password(callpom.getPassword(), "Adactinvishnu@19");
	}
	@Then("click the Login option")
	public void click_the_login_option() {
		login(callpom.getLogin());
	}
	@Given("User am on the hotel search page")
	public void user_am_on_the_hotel_search_page() {
	
	}
	@When("User select the location from the dropdown")
	public void user_select_the_location_from_the_dropdown() {
		Locationdd(homepom.getLocation(), "London");	
		}
	@When("choose a specific hotel")
	public void choose_a_specific_hotel() {
	Hoteldd(homepom.getHotels(), "Hotel Creek");
	}
	@When("select the room type")
	public void select_the_room_type() {
    Roomtypedd(homepom.getRoomType(),"Standard");
	}
	@When("specify the number of rooms")
	public void specify_the_number_of_rooms() {
	NoofroomDD(homepom.getRoomnos(), "1 - One");
	}
	@When("provide the check-in date")
	public void provide_the_check_in_date() {
		Cdatein(homepom.getDatein(), "12/07/2023");
	}
	@When("provide the check-out date")
	public void provide_the_check_out_date() {
		Cdateout(homepom.getDateout(), "14/07/2023");
	}
	@When("select the number of adults per room")
	public void select_the_number_of_adults_per_room() {
		AdroomDD(homepom.getAdultsroom(), "2 - Two");
	}
	@When("select the number of children per room")
	public void select_the_number_of_children_per_room() {
		CDD(homepom.getChildsroom(), "1 - One");
		
	}
	@When("click the search button")
	public void click_the_search_button() {
	searrchbox(homepom.getSrcbox());
	}
	@Then("the search should be successful")
	public void the_search_should_be_successful() {
	}
}
