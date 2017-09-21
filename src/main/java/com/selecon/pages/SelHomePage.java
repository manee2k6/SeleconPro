package com.selecon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Page Object Model approach helps to manage all object respository of page and test case separately for ease of use.
public class SelHomePage {
	public WebDriver driver; // Global declaration
	
	//Object Repository for WebElements:
	By SearchSelenium 			= By.xpath("//input[@id='q']");
	By GoBtn					= By.xpath("//input[@id='submit']");
	By ProjectsTab				= By.xpath("//li[@id='menu_projects']/a");
	By DownloadTab				= By.xpath("//li[@id='menu_download']/a");
	By DocumentationTab			= By.xpath("//li[@id='menu_documentation']/a");
	By SupportTab				= By.xpath("//li[@id='menu_support']/a");
	By AboutTab					= By.xpath("//li[@id='menu_about']/a");
	
	
	public SelHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	public void returnBackURL() {
		driver.navigate().back();
	}
	
	public void searchSelenium(String typeInput) {
		//Entering value to search field
		driver.findElement(SearchSelenium).sendKeys(typeInput);
		//click Go after entering value..
		driver.findElement(GoBtn).click();
    }
	
	public void clickProjectTab() {
		//click the project tab from homepage..
		driver.findElement(ProjectsTab).click();
	}
	
	public void clickDownloadTab() {
		//click the Download tab from homepage..
		driver.findElement(DownloadTab).click();
	}
	
	public void clickDocumentationTab() {
		//click the Documentation tab from hompage..
		driver.findElement(DocumentationTab).click();
	}
	
	public void clickSupportTab() {
		//click support tab from homepage..
		driver.findElement(SupportTab).click();
	}
	
	public String getPageTitle() {
		String title= driver.getTitle();
		return title;
	}
	
	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}
	
    
}
