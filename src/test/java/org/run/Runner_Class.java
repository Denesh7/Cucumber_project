package org.run;

import org.openqa.selenium.WebDriver;
import org.pom.Page_Object_Manager;

import com.adactin.baseclass.Base_Class;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver= Base_Class.getbrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) {
		
		driver= getURL("https://adactinhotelapp.com/index.php");
		
		inputvalueelement(pom.getLoginPage().getUsername(),"deneshdb");
		
		
		
	}

}
