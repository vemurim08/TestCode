package demoPack;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ESpicejet {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub



//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
driver.findElement(By.id("autosuggest")).sendKeys("ind");
Thread.sleep(2000);
List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
for(WebElement option :options)
{

if(option.getText().equalsIgnoreCase("India"))
{
option.click();
break;
}

}
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000L);
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
driver.findElement(By.className("ui-state-highlight")).click();
Thread.sleep(2000);

driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000L);
driver.findElement(By.id("hrefIncAdt")).click();
driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
driver.findElement(By.xpath(" //option[text()='AED']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='discount-checkbox']/div[2]")).click();
Thread.sleep(1000);
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

}
}