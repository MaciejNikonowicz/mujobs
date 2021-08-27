package pl.com.mikronika.mujobs.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pl.com.mikronika.mujobs.base.TestBase;
import pl.com.mikronika.mujobs.pages.HomePage;
import pl.com.mikronika.mujobs.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization("url");
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyPageLogoTest() {
		Assert.assertTrue(loginPage.verifyPageLogo());
	}
	
	@Test(priority=2)
	public void verifyMainHeaderTest() {
		String mainHeader = loginPage.verifyMainHeader();
		Assert.assertEquals(mainHeader, "Logowanie do systemu");
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
