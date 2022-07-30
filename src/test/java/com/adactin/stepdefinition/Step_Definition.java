package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.pom.Page_Object_Manager;

import com.adactin.baseclass.Base_Class;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class{
	
	public static WebDriver driver= Runner_Class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager (driver);
	
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
	String url = File_Reader_Manager.getInstance().getInstancecR().getUrl();
	
	driver=Base_Class.getURL(url);
	
	
	    
	}

	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String Username) {
		
		inputvalueelement(pom.getLoginPage().getUsername(), Username);
	    
	}
	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String Password) {
		inputvalueelement(pom.getLoginPage().getPassword(), Password);
	   
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickonelement(pom.getLoginPage().getLogin());
	    
	}

	@When("^user Select The Location From Dropdown$")
	public void user_Select_The_Location_From_Dropdown() throws Throwable {
		dropdown(pom.getSearchHotel().getLocation(), "selectByValue", "Melbourne");
	  
	}

	@When("^user Select The Hotel From Dropdown$")
	public void user_Select_The_Hotel_From_Dropdown() throws Throwable {
		
		dropdown(pom.getSearchHotel().getHotels(), "selectByValue", "Hotel Sunshine");
		
		
	   
	}

	@When("^user Select The Room Type From Dropdown$")
	public void user_Select_The_Room_Type_From_Dropdown() throws Throwable {
		
		dropdown(pom.getSearchHotel().getRoomType(), "selectByValue", "Double");
	    
	}

	@When("^user Select The Number Of Rooms From Dropdown$")
	public void user_Select_The_Number_Of_Rooms_From_Dropdown() throws Throwable {
		dropdown(pom.getSearchHotel().getRoomnos(), "selectByValue", "3");
	   
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		inputvalueelement(pom.getSearchHotel().getCheckIn(), "20/07/2022");
	    
	}

	@When("^user Enter The Check Out  Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		
		inputvalueelement(pom.getSearchHotel().getCheckOut(), "21/07/2022");
	   
	}

	@When("^user Select The Adults Per Room In The Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
		
		dropdown(pom.getSearchHotel().getAdultsPerRoom(), "selectByValue", "2");
	   
	}

	@When("^user Select The Childrens Per Room In The Childrens Per Room Field$")
	public void user_Select_The_Childrens_Per_Room_In_The_Childrens_Per_Room_Field() throws Throwable {
		
		dropdown(pom.getSearchHotel().getChildrensPerRoom(), "selectByValue", "4");
	   
	}

	@Then("^user Click The Search Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		
		clickonelement(pom.getSearchHotel().getSearch());
	    
	}

	@When("^user Select The Option In Select Hotel Field$")
	public void user_Select_The_Option_In_Select_Hotel_Field() throws Throwable {
		
		clickonelement(pom.getSearchHotel().getSearchinghotel());
	   
	}

	@Then("^user Click The Continue Button And It Naviagtes To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Naviagtes_To_Book_A_Hotel_Page() throws Throwable {
		
		clickonelement(pom.getSearchHotel().getContinues());
	   
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		
		inputvalueelement(pom.getBookAHotel().getFirst_Name(), "Denesh");
	   
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		
		inputvalueelement(pom.getBookAHotel().getLast_Name(), "babu");
	  
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		
		inputvalueelement(pom.getBookAHotel().getBilling_Address(), "IMC Nagar 2nd Street ");
	   
	}

	@When("^user Enter The  Credit Card Number In The Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
		
		inputvalueelement(pom.getBookAHotel().getCredit_Card(), "1234567887654321");
	  
	}

	@When("^user Select The Credit Card Type From Dropdown$")
	public void user_Select_The_Credit_Card_Type_From_Dropdown() throws Throwable {
		
		dropdown(pom.getBookAHotel().getCredit_Card_Type(),"selectByValue", "VISA");
	    
	}

	@When("^user Select The  Select Month Dropdown In Expiry Date Field$")
	public void user_Select_The_Select_Month_Dropdown_In_Expiry_Date_Field() throws Throwable {
		dropdown(pom.getBookAHotel().getExpiry_Month(), "selectByValue", "5");
	   
	}

	@When("^user Select The Select Year Dropdown In Select Year Field$")
	public void user_Select_The_Select_Year_Dropdown_In_Select_Year_Field() throws Throwable {
		dropdown(pom.getBookAHotel().getExpiry_Year(), "selectByValue", "2022");
	  
	}

	@When("^user Enter The Cvv Number In Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
		inputvalueelement(pom.getBookAHotel().getCvv(), "123");
	   
	}

	@Then("^user Click The Book Now Button And It Will Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Will_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		
		clickonelement(pom.getBookAHotel().getBookNow());
	   
	}
	
	

	@When("^user Click The Log Out Button$")
	public void user_Click_The_Log_Out_Button() throws Throwable {
		
		implicitwait(2000);
		
		clickonelement(pom.getBookingConfirmation().getend());
	 
	}

	

}
