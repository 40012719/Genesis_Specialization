import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println(driver.findElement(By.id("txtUsername")).getAttribute("value"));
		String s=driver.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		System.out.println(s);
	}

}
