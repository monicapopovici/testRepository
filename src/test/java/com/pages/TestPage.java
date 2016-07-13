package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/login")
public class TestPage extends PageObject {
	
	@FindBy(css="input[id*=_login]")
    private WebElement loginUserName;
	
	public void enter_userName(String userName) {
	       loginUserName.sendKeys(userName);
	}

}
