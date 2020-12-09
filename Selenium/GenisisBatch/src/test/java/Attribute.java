import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Attribute {
	
     @Test(description="method1")
	public void Register() throws Exception {
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
		driver.get("https://sciex.com/support/create-account?step=2");
		driver.findElement(By.name("FirstName")).sendKeys("abc");
		String s=driver.findElement(By.name("FirstName")).getAttribute("value");
		System.out.println(s);
		//GETTEXT method
		Thread.sleep(3000);
		String Z=driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div/div/div/div/div/section/div[3]/form/div[1]/div/p[1]/label/span")).getText();
		boolean b=driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div/div/div/div/div/section/div[3]/form/div[1]/div/p[1]/label/span")).isDisplayed();
		System.out.println(Z);
		System.out.println(b);
		
	
		
	}

}
