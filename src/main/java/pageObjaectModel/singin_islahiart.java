package pageObjaectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class singin_islahiart {
	WebDriver driver;

   By Icon=By.className("account-icon");
   By userName=By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/input");
   By Password=By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/div/input");
   By Singin=By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button");
   public singin_islahiart (WebDriver driver) {
		this.driver=driver;
			
		}
   public void Icon() {
	   driver.findElement(Icon).click();
	   
   }
   public void userName(String usenameValue) {
	   driver.findElement(userName).sendKeys(usenameValue);
   }
   public void Password(String usepasswordValue) {
	   driver.findElement(Password).sendKeys(usepasswordValue);
   }
   public void Singin() {
	   driver.findElement(Singin).click();
   }
}

