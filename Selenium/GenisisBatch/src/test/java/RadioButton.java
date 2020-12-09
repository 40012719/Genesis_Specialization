import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sciex.com/support/create-account");
		//Maximize window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav\"]/div/ul/li[1]/a"));
		
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
