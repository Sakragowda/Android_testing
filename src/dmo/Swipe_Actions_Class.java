package dmo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe_Actions_Class extends abc {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@index='9']").click();
		
		@SuppressWarnings("rawtypes")
		TouchAction t =new TouchAction(driver);
		WebElement sec15 = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement sec45 = driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(sec15)).withDuration(ofSeconds(2))).moveTo(element(sec45)).release().perform();
		

	}

}
