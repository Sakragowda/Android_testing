package demo;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class Test_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");
		
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	}

}
