package POM;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver ;
		
		// TODO Auto-generated method stub
		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");	     
	     
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     
	     capabilities.setCapability("automationName", "UiAutomator2");
	     capabilities.setCapability("appium-version", "1.20.2");
	     capabilities.setCapability("platformName", "Android");
	     capabilities.setCapability("platformVersion", "7");   // Emulator Nexus
	     
	     driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	     return driver; 
	   
	     
	}
	
	public static AndroidDriver<AndroidElement> capGeneral() throws MalformedURLException {
		
		 AndroidDriver<AndroidElement> driver;
		
		 File appDir = new File("src");
	     File app = new File(appDir, "General-Store.apk");
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	     
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "14");
		     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		     capabilities.setCapability("automationName", "UiAutomator2");
		     capabilities.setCapability("appium-version", "1.20.2");
		     capabilities.setCapability("platformName", "Android");
		     capabilities.setCapability("platformVersion", "7");
		     
		     driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    	      
		    return driver; 
		
	}

}
