import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pcadmin\\Downloads\\geckodriver-v0.27.0-win32\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://emicalculator.net/loan-calculator/#");

	}

}
