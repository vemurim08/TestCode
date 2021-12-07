package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		for(int i=1; i<=5; i++)
		{
			if( driver.findElement(By.xpath("//tr["+i+"]/td[1]")).getText().contains("Rice"))
			{
				WebElement veggie = driver.findElement(By.xpath("//tr["+i+"]/td[1]"));
				System.out.print(veggie.getText());
				System.out.println(veggie.findElement(By.xpath("following-sibling::td[1]")).getText());
			
			}
		
		}

	}

}
