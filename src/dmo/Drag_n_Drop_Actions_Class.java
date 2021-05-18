package dmo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Drag_n_Drop_Actions_Class extends abc{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction t =new TouchAction(driver);
	    WebElement drag =  driver.findElementsByClassName("android.view.View").get(0);
	    WebElement drop1 =  driver.findElementsByClassName("android.view.View").get(1);
//	    WebElement drop2 =  driver.findElementsByClassName("android.view.View").get(3);
	    
//		t.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(2))).moveTo(element(drop1)).release().perform();

	    t.longPress(element(drag)).moveTo(element(drop1)).release().perform();
//	    t.longPress(element(drop1)).moveTo(element(drag)).release().perform();


	}

}
