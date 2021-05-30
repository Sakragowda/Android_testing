package POM;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	
public AndroidDriver<AndroidElement> driver;

//	private AndroidDriver<AndroidElement> driver1;

	public HomePage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		
//		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
		
//		PageFactory.initElements(driver, driver);
		
//        this.driver1 = driver;
//        try {
//            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
	public WebElement preferenice;
	

}
