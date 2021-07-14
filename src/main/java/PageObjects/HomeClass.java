package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClass {
	public WebDriver driver;

	public HomeClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	List<WebElement> dynamicPopupList;
	
	public List<WebElement> dynamicPopupList(){
		return dynamicPopupList;
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement dynamicPopup;
	
	public WebElement dynamicPopup(){
		return dynamicPopup;
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchBar;
	
	public WebElement searchBar() {
		return searchBar;
	}
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement submit;
	
	public WebElement submit() {
		return submit;
	}
	
	@FindBy(xpath="//div[@title='4 GB'] //div[@class='_24_Dny']")
	WebElement filter;
	public WebElement filter() {
		return filter;
	}
	
	@FindBy(xpath="//div[text()='realme C21 (Cross Black, 64 GB)']")
	WebElement selectProduct;
	
	public WebElement selectProduct() {
		return selectProduct;
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addto;
	
	public WebElement addto() {
		return addto;
	}
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	WebElement price;
	
	public WebElement price() {
		return price;
	}
	
	@FindBy(xpath="//span[text()=' ₹8,999']")
	WebElement totalAmount;
	
	public WebElement totalAmount() {
		return totalAmount;
	}

	
	
}
