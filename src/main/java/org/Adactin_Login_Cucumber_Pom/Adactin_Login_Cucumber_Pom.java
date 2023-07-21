package org.Adactin_Login_Cucumber_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login_Cucumber_Pom {
	
   public  WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	

	public Adactin_Login_Cucumber_Pom(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	
	
}
