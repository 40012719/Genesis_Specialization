import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sciex.com/support/create-account?step=2");
		
		WebElement firstname=driver.findElement(By.name("FirstName"));
		firstname.sendKeys("suresh");
		Thread.sleep(3000);
		System.out.println(firstname.getAttribute("value"));
		Thread.sleep(3000);
		firstname.clear();
		driver.close();
		
		
		

	}

}
