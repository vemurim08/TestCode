
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivity {
	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/Ravulapalli/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
driver.navigate().to("https://rahulshettyacademy.com");
driver.navigate().back();
driver.navigate().forward();
}
}