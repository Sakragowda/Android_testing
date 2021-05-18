package dmo;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeCrickBuzz extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capability();
		/* driver.get("http://facebook.com");
		driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("qwerty");
		driver.findElementByName("pass").sendKeys("12345");
		driver.findElementByXPath("//button[@value='Log In']").click();*/
		//rahulonlinetutor@gmail.com

		// to get expth of Android webbrowser by using Chrome://inspect 
		
		driver.get("http://cricbuzz.com");
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = driver;  //java script
		   jse.executeScript("window.scrollBy(0,480)", "");  // scroll down or
//		   jse.executeScript("scroll(0, 480);");
		   
//		   jse.executeScript("window.scrollBy(0,-250)");  // scroll up
//		   OR,
		   jse.executeScript("scroll(0, -250);");  // scroll up 
		   Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
		   


		//adb devices- Unauthorized
		//adb kill-server
		//adb start-server
		//adb devices
	}

}
