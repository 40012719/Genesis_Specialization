import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"u_1_4\"]")).click();
		boolean a=driver.findElement(By.xpath("//*[@id=\"u_1_4\"]")).isSelected();
		System.out.println(a);

	}

}
