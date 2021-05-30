package POM;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverClass extends Base{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=capability();
		DriverClass d = new DriverClass();
		DriverClass.driverMethod(driver);
		
		
	}

	public static void driverMethod(AndroidDriver<AndroidElement> driver) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		HomePage h = new HomePage(driver);
		h.preferenice.click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Prefernices p = new Prefernices(driver);
		p.dependenices.click();
//		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByXPath("//android.widget.CheckBox[@index='o']").click();
		driver.findElementById("android:id/checkbox").click();
		
      
	}
}
