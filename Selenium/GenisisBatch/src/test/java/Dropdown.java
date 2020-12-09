import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(3000);
		
		WebElement dropdown= driver.findElement(By.id("select-demo"));
		
		Select dd =new Select(dropdown);
		dd.selectByVisibleText("Monday");
		Thread.sleep(3000);
		dd.selectByIndex(4);
		
		
		

	}

}
