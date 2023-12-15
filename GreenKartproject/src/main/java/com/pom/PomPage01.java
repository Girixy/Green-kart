package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement searchthevegetables;
	
	@FindBy(xpath="//button[@class='search-button']")
	private WebElement clicksearchicon;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement clickaddtocart;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement clickitem;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement clickproceedtocheckout;

	public PomPage01(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSearchthevegetables() {
		return searchthevegetables;
	}

	public WebElement getClicksearchicon() {
		return clicksearchicon;
	}

	public WebElement getClickaddtocart() {
		return clickaddtocart;
	}

	public WebElement getClickitem() {
		return clickitem;
	}

	public WebElement getClickproceedtocheckout() {
		return clickproceedtocheckout;
	}
	
}
