package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@style='width: 200px;']")
	private WebElement selectthecountry;
	
	@FindBy(xpath="//input[@class='chkAgree']")
	private WebElement clicktheagreebutton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement clicktheproceed;

	public PomPage03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelectthecountry() {
		return selectthecountry;
	}

	public WebElement getClicktheagreebutton() {
		return clicktheagreebutton;
	}

	public WebElement getClicktheproceed() {
		return clicktheproceed;
	}
	
	

}
