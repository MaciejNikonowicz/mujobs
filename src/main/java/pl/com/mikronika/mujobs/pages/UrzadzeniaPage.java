package pl.com.mikronika.mujobs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.com.mikronika.mujobs.base.TestBase;

public class UrzadzeniaPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"adress_bar\"]/h3")
	WebElement pageHeader;
	
	@FindBy(id="search_button")
	WebElement searchBtn;
	
	@FindBy(id="urzadzenie_msk_z_obiektami_menu")
	WebElement listaUrzadzen;
	
	@FindBy(id="ajax1")
	WebElement searchBar;
	
	@FindBy(id="add_to_list_icon")
	WebElement addNewBtn;
	
	public UrzadzeniaPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public String verifyPageHeader() {
		return pageHeader.getText();
	}
	
	public boolean clickSearchBtnAll() {
		searchBtn.click();
		return listaUrzadzen.isDisplayed();
	}
	
	public boolean clickSearchBtnWithText(String searchText) {
		searchBar.sendKeys(searchText);
		searchBtn.click();
		return listaUrzadzen.isDisplayed();
	}
	
	public DodajUrzadzeniePage clickAddNewBtn() {
		addNewBtn.click();
		
		return new DodajUrzadzeniePage();
	}

}
