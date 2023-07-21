package org.Adactin_Homepage_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Homepage_Pom {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement RoomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement Roomnos;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement Datein;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement Dateout;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement Adultsroom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement Childsroom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement srcbox;


	public Adactin_Homepage_Pom(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomnos() {
		return Roomnos;
	}

	public WebElement getDatein() {
		return Datein;
	}

	public WebElement getDateout() {
		return Dateout;
	}

	public WebElement getAdultsroom() {
		return Adultsroom;
	}

	public WebElement getChildsroom() {
		return Childsroom;
	}

	public WebElement getSrcbox() {
		return srcbox;
	}

}
