import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sciex.com/support/create-account?step=2");
//		driver.findElement(By.name("FirstName")).sendKeys("Suresh");
//		driver.findElement(By.id("pass")).sendKeys("patil");
		driver.findElement(By.name("FirstName")).sendKeys("Sachin");

	}

}
