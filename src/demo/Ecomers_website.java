package demo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dmo.abc;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Ecomers_website extends abc{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver= capability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		LoginValidatio(driver);
//		errorToast(driver);
        
		
		
	}
	public static void LoginValidatio(AndroidDriver<AndroidElement> driver) {
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("sakra");
		driver.hideKeyboard();
		driver.findElementById("com.androidsample.generalstore:id/radioMale").click();
		driver.findElementById("android:id/text1").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));");
		//UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "Kuwait" + "\").instance(0))"));     
		driver.findElementByXPath("//android.widget.TextView[@text='Brazil']").click();
//		driver.findElementByXPath("//*[@text='Let's  Shop']").click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//	    SelectAddtoCart(driver);
	    sumOfCartvalue(driver);
	}
	
	public static void errorToast(AndroidDriver<AndroidElement> driver) {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastMessage);
		Assert.assertEquals("Please enter your name", toastMessage); //Actual validation
	}
	
	public static void SelectAddtoCart(AndroidDriver<AndroidElement> driver) {
	     
	     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

	    int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

	    for(int i=0;i<count;i++)
	    {
	    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	       if(text.equalsIgnoreCase("Jordan 6 Rings"))
	       {
	       driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
	       break;
	      }
	    }
	   String lastpageText=    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	   Assert.assertEquals("Jordan 6 Rings", lastpageText);
	   System.out.println(lastpageText);
       driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	  }
	
	
	   public static void sumOfCartvalue(AndroidDriver<AndroidElement> driver) {
		   
	   List<AndroidElement> resoreseList  = driver.findElementsByClassName("android.widget.RelativeLayout");
	   double sum = 0 ;
	   for (int i = 0; i < resoreseList.size(); i++) {
		   	driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
	   }
	   driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
//	   int priceList = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
//	   for (int i = 0; i < priceList; i++) {
//	   String price = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
//	   System.out.println(price);
//	   price= price.substring(1);
//	   double intPrice=Double.parseDouble(price);
//	   sum = sum+intPrice;
//	   }
//	   System.out.println(sum);
//	   String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//	   total= total.substring(1);
//	   @SuppressWarnings("unused")
//	   double totalValue=Double.parseDouble(total);
//	   if(totalValue==sum) {
//		   System.out.println("Total sum of the product is equal to the sum of the all product");
//	   }
	   
	   webNative(driver);
	}
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void webNative(AndroidDriver<AndroidElement> driver)  {
		// TODO Auto-generated method stub
		WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
		TouchAction t=new TouchAction(driver);
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		WebElement termsNcondition = driver.findElementById("com.androidsample.generalstore:id/termsButton");
		t.longPress(longPressOptions().withElement(element(termsNcondition)).withDuration(ofSeconds(2))).release().perform();
        driver.findElementById("android:id/button1").click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<String> contexts=driver.getContextHandles();
		for (String conextName : contexts) {
			System.out.println(conextName);
		}

		driver.context("WEBVIEW_com.androidsample.generalstore");
//		driver.findElement(By.name("q")).sendKeys("hello");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		  WebElement serchEngine = driver.findElementByXPath("//input[@name='q']");
	      serchEngine.sendKeys("selenium",Keys.ENTER);
		  driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
	}
	 
	
}

