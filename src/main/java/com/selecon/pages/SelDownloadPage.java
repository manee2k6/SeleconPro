package com.selecon.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class SelDownloadPage {
	public WebDriver driver; // Global declaration
	
	//Object Repository for WebElements:
	By SelStdAloneDownloadLink		= By.xpath("//div[@id='mainContent']/p[3]/a");
	By PreviousReleaseLink			= By.xpath("//div[@id='mainContent']/p[1]/a[1]");
	
	
	public SelDownloadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openDownloadPageURL() throws IOException {
		driver.get(PropFileHandler.fetchProp(AutoConstants.Url.DOWNLOAD_URL));
	}
	
	public void clickDownloadLink() {
		//click the download link of selenium standalone server..
		driver.findElement(SelStdAloneDownloadLink).click();
	}
	
	public String getPageTile() {
		return driver.getTitle();
	}
	
	public void clickPrevRelease() {
		driver.findElement(PreviousReleaseLink).click();
	}
}
