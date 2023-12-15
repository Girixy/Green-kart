package com.stepdefinition;

import org.openqa.selenium.By;

import com.baseclass.BaseClass;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {
	
	PomPage01 a=new PomPage01(driver);
	PomPage02 b=new PomPage02(driver);
	PomPage03 c=new PomPage03(driver);
	
	@Given("user launch the url")
	public void user_launch_the_url() {
	    getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("user search the vegetables")
	public void user_search_the_vegetables() {
	   a.getSearchthevegetables().sendKeys("cucumber");
	}

	@When("user click search icon")
	public void user_click_search_icon() {
	    a.getClicksearchicon().click();
	}

	@When("user click addtocart")
	public void user_click_addtocart() {
		a.getClickaddtocart().click();
	}

	@When("user click items")
	public void user_click_items() {
		a.getClickitem().click();
	}

	@When("user click proceedtocheckout")
	public void user_click_proceedtocheckout() {
		a.getClickproceedtocheckout().click();
	}

	@Then("next page shown")
	public void next_page_shown() {
	   getTitle();
	}

	@When("user enter promo code")
	public void user_enter_promo_code() throws InterruptedException {
		Thread.sleep(2000);
	   b.getEnterpromocode().sendKeys("12345678");
	}

	@When("user click the apply button")
	public void user_click_the_apply_button() {
	   b.getClickapplybutton().click();
	}

	@When("user click the Place order")
	public void user_click_the_place_order() {
	    b.getClicktheplaceorder().click();
	}

	@Then("the next page Shown")
	public void the_next_page_shown() {
	    getTitle();
	}

     @When("user select the country")
     public void user_select_the_country() {
         c.getSelectthecountry().sendKeys("India");
    }

     @When("user click the agree button")
     public void user_click_the_agree_button() {
         c.getClicktheagreebutton().click();
    }

     @When("user click the proceed")
     public void user_click_the_proceed() {
         c.getClicktheproceed().click();
    }

}
