package pl.com.mikronika.mujobs.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pl.com.mikronika.mujobs.base.TestBase;
import pl.com.mikronika.mujobs.pages.HomePage;
import pl.com.mikronika.mujobs.pages.LoginPage;
import pl.com.mikronika.mujobs.pages.UrzadzeniaPage;
import pl.com.mikronika.mujobs.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	UrzadzeniaPage urzadzeniaPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization("url");
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Mujobs");
	}
	
	@Test(priority=2)
	public void verifyProjectLogoTest() throws InterruptedException {
		testUtil.switchToFrame("header");
		String projectLogo = homePage.verifyProjectLogo();
		Assert.assertEquals(projectLogo, "Mujobs");
	}
	
	@Test(priority=3)
	public void verifyMainTableMenuExistanceTest() throws InterruptedException {
		testUtil.switchToFrame("menu");
		Assert.assertTrue(homePage.verifyIfMainTableMenuExists());
	}
	
	@Test(priority=4)
	public void clickProdukcjaUrzadzeniaMenuLinkTest() throws InterruptedException {
		testUtil.switchToFrame("menu");
		urzadzeniaPage = homePage.clickProdukcjaUrzadzeniaMenuLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
