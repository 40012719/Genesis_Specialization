import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ibef.org/ibefusers/signUpRequest");
		Thread.sleep(3000);
		boolean beforeclick=driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).isSelected();
		System.out.println(beforeclick);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).click();
		Thread.sleep(3000);
		boolean afterclick=driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).isSelected();
		System.out.println(afterclick);
		boolean male=driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[1]/span/a")).isSelected();
		System.out.println(male);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[1]/span/a")).click();
		boolean maleafterclick=driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[1]/span/a")).isSelected();
		System.out.println(maleafterclick);
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[2]/li[8]/span[1]/a")).click();
		boolean byclick=driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[2]/li[8]/span[1]/a")).isSelected();
		System.out.println(byclick);
	}

}
