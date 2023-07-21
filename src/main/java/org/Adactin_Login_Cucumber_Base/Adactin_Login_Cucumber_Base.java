package org.Adactin_Login_Cucumber_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Login_Cucumber_Base {

	
	
	//static WebDriver driver;

	public static void maxWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public static void toFetchTitle(WebDriver driver) {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}
	public static void toFetchurl(WebDriver driver) {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void launchurl(WebDriver driver, String s) {
		driver.get(s);
	}

	public static void username(WebElement uname, String s1) {
		uname.sendKeys(s1);
	}

	public static void password(WebElement pword, String s2) {
		pword.sendKeys(s2);
	}

	public static void login(WebElement btn) {
		btn.click();
	}

	public static void Locationdd(WebElement Ldd, String s) {
		Select locdd = new Select(Ldd);
		locdd.selectByVisibleText(s);
	}

	public static void Hoteldd(WebElement Hdd, String s1) {
		Select Hotdd = new Select(Hdd);
		Hotdd.selectByVisibleText(s1);
	}

	public static void Roomtypedd(WebElement Rtdd, String s2) {
		Select Roomdd = new Select(Rtdd);
		Roomdd.selectByVisibleText(s2);
	}

	public static void NoofroomDD(WebElement Ntdd, String s3) {
		Select Nofdd = new Select(Ntdd);
		Nofdd.selectByVisibleText(s3);
	}

	public static void Cdatein(WebElement cdin, String s4) {
		cdin.clear();
		cdin.sendKeys(s4);
	}

	public static void Cdateout(WebElement cdout, String s5) {
		cdout.clear();
		cdout.sendKeys(s5);
	}

	public static void AdroomDD(WebElement Ardd, String s6) {
		Select Armdd = new Select(Ardd);
		Armdd.selectByVisibleText(s6);
	}

	public static void CDD(WebElement Crdd, String s7) {
		Select Crmdd = new Select(Crdd);
		Crmdd.selectByVisibleText(s7);
	}
	
	public static void searrchbox(WebElement srbox) {
	srbox.click();
	}
	}


