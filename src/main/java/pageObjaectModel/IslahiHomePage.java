package pageObjaectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IslahiHomePage {
	WebDriver driver;
	By WomenClothing=By.xpath("//*[@id=\"menu-item-37\"]/a");
	By SkirtsandDresser=By.xpath("//*[@id=\"menu-item-2099\"]/a");
	public IslahiHomePage(WebDriver driver) {
		this.driver=driver;
		
	}

	public void getWomenClothing() {
	WebElement WomenCloths=	driver.findElement(WomenClothing);
	Actions a= new Actions(driver);
	a.moveToElement(WomenCloths).perform();
	}
	public void getSkirtsandDresser() {
	WebElement SkirtsandDressers=driver.findElement(SkirtsandDresser);
	SkirtsandDressers.click();
	}
}
