package org.ghi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public static WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement end;

	public Booking_Confirmation(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getend() {
		return end;
	}

}
