package pl.com.mikronika.mujobs.util;

import org.openqa.selenium.support.ui.ExpectedConditions;

import pl.com.mikronika.mujobs.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;
	
	// u¿ywane przy <frame> - na tym zbudowany jest mujobs, wiêc trzeba prze³¹czaæ pomiêdzy frame (np. main, menu, header itp)
	public void switchToFrame(String frameName) throws InterruptedException {
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
		Thread.sleep(500);
	}
	
	public void switchToFrame(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
}
