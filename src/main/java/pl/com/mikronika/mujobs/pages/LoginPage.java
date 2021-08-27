package pl.com.mikronika.mujobs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.com.mikronika.mujobs.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory - Object Repository (OR)
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="project_name")
	WebElement projectName;
	
	@FindBy(id="any_lang")
	WebElement language;
	
	@FindBy(xpath="//*[@id=\"submit_login\"]/input")
	WebElement submitBtn;
	
	@FindBy(id="img_syndis")
	WebElement logo;
	
	@FindBy(className="title_of_page")
	WebElement mainHeader;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPageLogo() {
		return logo.isDisplayed();
	}
	
	public String verifyMainHeader() {
		return mainHeader.getText();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new HomePage();
	}

}
