package org.ghi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement first_Name;
	
	@FindBy(id="last_name")
	private WebElement last_Name;
	
	@FindBy(id="address")
	private WebElement billing_Address;
	
	@FindBy(id="cc_num")
	private WebElement credit_Card;
	
	@FindBy(id="cc_type")
	private WebElement credit_Card_Type;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiry_Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiry_Year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	public Book_A_Hotel(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getCredit_Card() {
		return credit_Card;
	}

	public WebElement getCredit_Card_Type() {
		return credit_Card_Type;
	}

	public WebElement getExpiry_Month() {
		return expiry_Month;
	}

	public WebElement getExpiry_Year() {
		return expiry_Year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
}
