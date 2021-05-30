package dmo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		/* we should start appium ad emulator 
		 * path should correct
		 * jre should be in class path , remove from moudle path
		 * desiredCapabilities we needs to add automationName = UiAutomation1
		 * 
		 */

		
		AndroidDriver<AndroidElement>  driver;
//		WebDriver driver;
		
		// TODO Auto-generated method stub
		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");  
	     
//		 File app = new File(appDir, "Api-demos-debug.apk");
	     
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
//	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "46168ec3 ");
//	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     
//	     capabilities.setCapability("automationName", "UiAutomator1");
	     capabilities.setCapability("automationName", "UiAutomator2");
	     capabilities.setCapability("appium-version", "1.20.2");
	     capabilities.setCapability("platformName", "Android");
//	     capabilities.setCapability("platformVersion", "11");   // Emulator Pixel_xl or sakra or sakra_1
//	     capabilities.setCapability("platformVersion", "7");   // Emulator Nexus
	     capabilities.setCapability("platformVersion", "9");  // real device MI redmi note 5 pro
	     
	     capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	     capabilities.setBrowserName("Chrome");
	     
//	     capabilities.setCapability("no",true);
//	     capabilities.setCapability("newCommandTimeout", 100);
//	     capabilities.setCapability("noReset", true);
//	     capabilities.setCapability("automationName", "selendroid");
//	     capabilities.setCapability("noRest", true);
	     
	     
//	     driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	     
	     driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	      
	    return driver; 

	}

}
