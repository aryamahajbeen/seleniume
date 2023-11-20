package Test_case;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Browser;
import Utilities.File;
import pageObjaectModel.singin_islahiart;


public class sing_test {
	WebDriver driver;
	@BeforeMethod
	public void browser() throws IOException {
		String web=File.website("browserType");
		if(web.equalsIgnoreCase("chrome")) {
			driver=Browser.getChromeDriver();
			driver.get("https://islahiart.com/");
			driver.manage().window().maximize();
			driver.navigate().refresh();
			}
		  }
	 
	@Test
	public void test() {
		singin_islahiart a=new singin_islahiart (driver);
		a.Icon();
		a.userName("kamrun.imam");
		a.Password("Success#23IT");
		a.Singin();
	}
	
}
