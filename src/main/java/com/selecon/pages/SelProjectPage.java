package com.selecon.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class SelProjectPage {
	public WebDriver driver; // Global declaration
	
	//Object Repository for WebElements:
	
	By SeleniumWebDriverLink		= By.xpath("//*[@id='mainContent']/div/h3[1]/a");
	
	
	
	public SelProjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openProjectPageURL() throws IOException {
		driver.get(PropFileHandler.fetchProp(AutoConstants.Url.PROJECT_URL));
	}
	
	public void clickSeleniumWebDriverLink() {
		driver.findElement(SeleniumWebDriverLink).click();
	}

}
