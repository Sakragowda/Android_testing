package dmo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserAction extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException, AWTException {
		// TODO Auto-generated method stub
//		WebDriver driver=capability();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidDriver<AndroidElement> driver = capability();
		driver.get("http://www.google.com");
//		driver.findElementByClassName("gLFyf").sendKeys("facebook.com");
		WebElement search= driver.findElementByXPath("//input[@name='q']");
		search.sendKeys("facebook.com");
//		driver.findElementByXPath("//span[@b='Log In or Sign Up']").click();
		driver.get("facebook.com");
		
		Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		driver.get("http://www.google.com");
		WebElement search1= driver.findElementByXPath("//input[@name='q']");
		search1.sendKeys("facebook.com");
        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
