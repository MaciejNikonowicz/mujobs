package pl.com.mikronika.mujobs.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pl.com.mikronika.mujobs.base.TestBase;
import pl.com.mikronika.mujobs.pages.DodajUrzadzeniePage;
import pl.com.mikronika.mujobs.pages.HomePage;
import pl.com.mikronika.mujobs.pages.LoginPage;
import pl.com.mikronika.mujobs.pages.UrzadzeniaPage;
import pl.com.mikronika.mujobs.util.TestUtil;

public class DodajUrzadzeniePageTest extends TestBase {
	LoginPage loginPage;
	TestUtil testUtil;
	HomePage homePage;
	UrzadzeniaPage urzadzeniaPage;
	DodajUrzadzeniePage dodajUrzadzeniePage;
	
	public DodajUrzadzeniePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("url");
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame("menu");
		urzadzeniaPage = homePage.clickProdukcjaUrzadzeniaMenuLink();
		testUtil.switchToFrame("right");
		dodajUrzadzeniePage = urzadzeniaPage.clickAddNewBtn();
		
	}
	
	@Test
	public void addNewPrzyrzadyNadzorowaneTest() throws InterruptedException {
		dodajUrzadzeniePage.addNewPrzyrzadyNadzorowane();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
