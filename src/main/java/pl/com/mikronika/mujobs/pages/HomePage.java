package pl.com.mikronika.mujobs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.com.mikronika.mujobs.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id="project_label_great")
	WebElement projectLogo;
	
	@FindBy(id="mainTable_menu")
	WebElement mainTableMenu;
	
	@FindBy(xpath="//*[@id=\"jt79\"]/a")
	WebElement produkcjaLinkMenu;
	
	@FindBy(xpath="//a[text()='Urz¹dzenia']")
	WebElement urzadzeniaLinkMenu;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public String verifyProjectLogo() {
		return projectLogo.getText();
	}
	
	public boolean verifyIfMainTableMenuExists() {
		return mainTableMenu.isDisplayed();
	}
	
	public UrzadzeniaPage clickProdukcjaUrzadzeniaMenuLink() {
		produkcjaLinkMenu.click();
		urzadzeniaLinkMenu.click();
		
		return new UrzadzeniaPage();
	}
	
}
