package Test_case;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Browser;
import Utilities.File;
import pageObjaectModel.IslahiHomePage;

public class Test_islahiart {
	
	WebDriver driver;//golabole variable
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
	public void getWomensCloth() {
		IslahiHomePage ih=new IslahiHomePage(driver);
		ih.getWomenClothing();
		ih.getSkirtsandDresser();
	
	}
}
