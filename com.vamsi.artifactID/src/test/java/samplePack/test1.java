// comments should be added in script
package samplePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\selenium software\\Chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	

}
