package Test_practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time_out_test {
	
	@Test(timeOut = 2000)
	public void browser_Launch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VM452YE\\eclipse-workspace\\Test_ng\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
	}

}
