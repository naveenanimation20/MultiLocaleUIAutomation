package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtil;

public class HomePage {
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	private WebElement getHeaderElement(String headerValue) {
		String headerXpathValue = "//a[contains(text(),'"+headerValue+"')]";
		return elementUtil.getElement("xpath", headerXpathValue);
	}
	
	public boolean isHeaderExist(String headerValue) {
		String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
		return getHeaderElement(headerValue).isDisplayed();
	}
	
	private WebElement getContactElement(String contactValue) {
		String contactXpathValue = "//a[contains(text(),'"+contactValue+"')]";
		return elementUtil.getElement("xpath", contactXpathValue);
	}
	
	public boolean isContactExist(String contactValue) {
		String contact = getContactElement(contactValue).getText();
		System.out.println(contact);
		return getContactElement(contactValue).isDisplayed();
	}
	

}
