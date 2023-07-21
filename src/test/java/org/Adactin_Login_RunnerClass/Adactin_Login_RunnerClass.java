package org.Adactin_Login_RunnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\Adactin_Feature\\Adactin_Login.feature",glue = "org.Adactin_Login_StepDefinition",tags="@ad2")


public class Adactin_Login_RunnerClass {
	
//	public static WebDriver driver;
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void start() {

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);

	}
	
}
