package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Prefernices {
	
	
	public AndroidDriver<AndroidElement> driver;


//	private AndroidDriver<AndroidElement> driver1;

	public Prefernices(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		
//		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
//		PageFactory.initElements(driver, this );
		
//		this.driver1 = driver;
//        try {
//            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement dependenices;
	
	

}
