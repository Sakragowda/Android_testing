package dmo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_demo {
	public static void main(String[] args) throws MalformedURLException {
//		   File f = new File("src");
//		   File fs = new File(f,"ApiDemos.debug.apk");
//	       DesiredCapabilities cap = new DesiredCapabilities();
//	       cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sakra");
//	       cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//	       cap.setCapability("automationName", "UiAutomator1");
//	       @SuppressWarnings("unused")
//		AndroidDriver<AndroidElement>  driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		@SuppressWarnings("unused")
		AndroidDriver<AndroidElement>  driver;
		// TODO Auto-generated method stub
		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sakra");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     capabilities.setCapability("automationName", "UiAutomator2");
	     capabilities.setCapability("platformVersion", "11");
	     driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

}
