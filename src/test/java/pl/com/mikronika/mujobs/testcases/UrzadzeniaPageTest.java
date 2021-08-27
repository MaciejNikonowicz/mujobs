package pl.com.mikronika.mujobs.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pl.com.mikronika.mujobs.base.TestBase;
import pl.com.mikronika.mujobs.pages.DodajUrzadzeniePage;
import pl.com.mikronika.mujobs.pages.HomePage;
import pl.com.mikronika.mujobs.pages.LoginPage;
import pl.com.mikronika.mujobs.pages.UrzadzeniaPage;
import pl.com.mikronika.mujobs.util.TestUtil;

public class UrzadzeniaPageTest extends TestBase {
	
	LoginPage loginPage;
	TestUtil testUtil;
	HomePage homePage;
	UrzadzeniaPage urzadzeniaPage;
	DodajUrzadzeniePage dodajUrzadzeniePage;
	
	public UrzadzeniaPageTest() {
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
	}
	
	@Test(priority=1)
	public void verifyPageHeaderTest() throws InterruptedException {
		Thread.sleep(2000);
		String pageHeader = urzadzeniaPage.verifyPageHeader();
		Assert.assertEquals(pageHeader, "Urz¹dzenia");
	}
	
	@Test(priority=2)
	public void clickSearchBtnAllTest() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(urzadzeniaPage.clickSearchBtnAll());
	}
	
	@Test(priority=3)
	public void clickSearchBtnWithTextTest() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(urzadzeniaPage.clickSearchBtnWithText("Huta"));
	}
	
	@Test(priority=4)
	public void clickAddNewBtnTest() throws InterruptedException {
		Thread.sleep(2000);
		dodajUrzadzeniePage = urzadzeniaPage.clickAddNewBtn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
