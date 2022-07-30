package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.ghi.Login_Page;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
public static WebDriver driver; 
	
	public static String value;
	
	public static WebDriver  getbrowser(String type) {           //1browser launch
if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	         driver=new ChromeDriver();
			
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
	       driver=new FirefoxDriver();
			
		}
		
    driver.manage().window().maximize();     //2 maximize
	return driver;
	}
	
	public static  void clickonelement(WebElement element) {   //3 click
		element.click();
		

	}
	
	public static void inputvalueelement(WebElement element, String value) { // 4sendkeys
		
		element.sendKeys(value);
		

	}
	
	public static  WebDriver getURL(String link) {  // 5get
		driver.get(link);
		return driver;
	}
	
	public static WebDriver navigateto(String link) {  //6navigateto
		driver.navigate().to(link);
		return driver;

	}
	
	public static WebDriver navigateback() {    //7navigateback
		driver.navigate().back();
		return driver;
		
	}
	
	public static WebDriver navigaterefresh() {  //8navigaterefresh
		driver.navigate().refresh();
		return driver;
		

	}
	
	public static  void gettitle() {            //9 gettitle
		String title = driver.getTitle();
       System.out.println(title);
	}
        
	
	
	public static void dropdown(WebElement element, String type, String value) {  //10 dropdown
		Select s=new Select(element);
		if (type.equalsIgnoreCase("selectByValue")) {
			s.selectByValue(value);
			
		}
		else if (type.equalsIgnoreCase("selectByIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
			
		}
		else if (type.equalsIgnoreCase(" ")) {
			
			s.selectByVisibleText(value);
			
		}

	}
	
	public static WebDriver close() {  //11close
		driver.close();
		return driver;

	}
	
	public static WebDriver quit() {   //12quit
		driver.quit();
		return driver;

	}
	
	
	public static  void getcurrenturl() {            //13 getcurrenturl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	
	public static void isselected(WebElement element) {   //14isselected
		System.out.println(element.isSelected());
		

	}
	
	public static void getattribute(WebElement element) {  //15getattribute
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		

	}
	
	public static void AlertHandle(String options) {      //16 Alert
		
		Alert alert = driver.switchTo().alert();
		
		if (options.equalsIgnoreCase("ok")) {
			
			alert.accept();
			
		}else if (options.equalsIgnoreCase("cancel")) {
			
			alert.dismiss();
		}
		

	}
	
	
	public static  void alertHandle2(String value) {
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys(value);
		
		System.out.println(alert.getText());
		
		alert.accept();

	}
	
	 public static void Actions(WebElement element,String options ) {  //17Alert
		 
		 Actions db = new Actions(driver);
		 
		 if (options.equalsIgnoreCase("clickme")) {
			 
			 db.click(element).click().perform();
			
		}else if (options.equalsIgnoreCase("Rightclick")) {
			db.contextClick(element).click().perform();
			
		}else if (options.equalsIgnoreCase("doubleclick")) {
			db.doubleClick(element).build().perform();
			
		}
		

	}
	 
	 public static void Draganddrop(WebElement sr, WebElement tg) {   //18 Draganddrop 
		 
		 Actions db = new Actions(driver);
		 
		 db.dragAndDrop(sr, tg).build().perform();

	}
	
	public static  void robot(String options) throws AWTException {      //19 robot class
		Robot f = new Robot();
		
		if (options.equalsIgnoreCase("down")) {
			f.keyPress(KeyEvent.VK_DOWN);
			f.keyRelease(KeyEvent.VK_DOWN);
			
		}
		else if (options.equalsIgnoreCase("up")) {
			f.keyPress(KeyEvent.VK_UP);
			f.keyRelease(KeyEvent.VK_UP);
		}
		
		else if (options.equalsIgnoreCase("Enter")) {
			f.keyPress(KeyEvent.VK_ENTER);
			f.keyRelease(KeyEvent.VK_ENTER);
		}
		
		else if (options.equalsIgnoreCase("Right")) {
			f.keyPress(KeyEvent.VK_RIGHT);
			f.keyRelease(KeyEvent.VK_RIGHT);
			
		}else if (options.equalsIgnoreCase("Left")) {
			f.keyPress(KeyEvent.VK_LEFT);
			f.keyRelease(KeyEvent.VK_LEFT);
		}

	}
	
	public static void Scrollpages(WebElement element) {       //20 scroll pages
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		

	}
	
	public static void implicitwait(int f) {                             //21 implicitwait
		driver.manage().timeouts().implicitlyWait(f, TimeUnit.SECONDS);

	}
	
	public static  void movetoelment(WebElement element) {            //22 movetoelement
		Actions db = new Actions(driver);
		
		db.moveToElement(element).build().perform();

	}
	
//	public static String read_Data(String path,int sheet_Index,int row_Index,int cell_Index) throws IOException {
//		File f = new File(path);
//		
//		FileInputStream fis = new FileInputStream(f);
//		
//		Workbook wb = new XSSFWorkbook(fis);
//		
//		Sheet sheetAt = wb.getSheetAt(sheet_Index);
//		
//		Row row = sheetAt.getRow(row_Index);
//		
//		Cell cell = row.getCell(cell_Index);
//		
//		CellType cellTypeEnum = cell.getCellTypeEnum();
//		
//		if (cellTypeEnum.equals(CellType.STRING)) {
//			
//			 value = cell.getStringCellValue();
//			
//		}
//		
//		else if (cellTypeEnum.equals(CellType.NUMERIC)) {
//			
//			double numericCellValue = cell.getNumericCellValue();
//			
//			int data= (int) numericCellValue;
//			
//			value=String.valueOf(data);
//			
//		}
//		return value;
//		
		

	}


