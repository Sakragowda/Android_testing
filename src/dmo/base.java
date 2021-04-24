package dmo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class base extends abc{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=capability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 *   //tagName[@attribute='value'];
		 */
		
//		Thread.sleep(10);
//		driver.findElementByAndroidUIAutomator("//android.widget.Button[@text='Continue']").click();
//		driver.findElementByAndroidUIAutomator("Continue").click();
//		driver.findElementByAndroidUIAutomator("android.widget.Button[@text='OK']").click();
//		driver.findElementByAndroidUIAutomator("//android.widget.TextView[@text='Preference']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		
//		Thread.sleep(10);
//		driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
//		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//		driver.findElementByXPath("//android.widget.CheckBox[@index='o']").click();
		driver.findElementById("android:id/checkbox").click();
		
		//new way to find elements if the same elements are presents in Xpath
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello sakra");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        
        


		
		

	}

}
