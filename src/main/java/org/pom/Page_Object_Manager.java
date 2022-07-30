package org.pom;

import org.ghi.Book_A_Hotel;
import org.ghi.Booking_Confirmation;
import org.ghi.Login_Page;
import org.ghi.Search_Hotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public Login_Page getLoginPage() {
		
		Login_Page lp = new Login_Page(driver);
		return lp;
		
		
	}
	
	public Search_Hotel getSearchHotel() {
		
		Search_Hotel sh= new Search_Hotel(driver);
		return sh;
	}
	
	
	public Book_A_Hotel getBookAHotel() {
		
		Book_A_Hotel bh = new Book_A_Hotel(driver);
		return bh;
	}
	
	public Booking_Confirmation getBookingConfirmation() {
		
		Booking_Confirmation bc = new Booking_Confirmation(driver);
		return bc;
		
		
	}

}
