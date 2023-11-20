package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver getChromeDriver() {
	
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}

}
