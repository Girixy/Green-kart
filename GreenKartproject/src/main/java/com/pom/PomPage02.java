package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@class='promoCode']")
	private WebElement enterpromocode;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement clickapplybutton;
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement clicktheplaceorder;

	public PomPage02(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getEnterpromocode() {
		return enterpromocode;
	}

	public WebElement getClickapplybutton() {
		return clickapplybutton;
	}

	public WebElement getClicktheplaceorder() {
		return clicktheplaceorder;
	}
	
	

}
