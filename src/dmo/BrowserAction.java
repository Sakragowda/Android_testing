package dmo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserAction extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//		WebDriver driver=capability();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidDriver<AndroidElement> driver = capability();
		driver.get("http://www.google.com");
//		driver.findElementByClassName("gLFyf").sendKeys("facebook.com");
		driver.findElementByXPath("//input[@name='q']").sendKeys("facebook.com");
		
	}

}
