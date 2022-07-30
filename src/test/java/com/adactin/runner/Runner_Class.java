package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.properties.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition", 
dryRun = false,
monochrome = true,
strict = true,
//tags="@smoketest",
plugin= {"html:Report/Html_Report",
		"pretty",
		"json:Report/Json_Report.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_File.html"
})


public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static  void set_Up() throws IOException {
		
		String browser = File_Reader_Manager.getInstance().getInstancecR().getBrowser();
		
		driver=Base_Class.getbrowser(browser);

	}
	
	@AfterClass
	public static void closing() {
	
	driver=Base_Class.close();

	}

}
