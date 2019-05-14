import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaghavendraRevanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
          //WebDriver driver = new ChromeDriver();
          FirefoxDriver driver = new FirefoxDriver();
          driver.get("https://www.google.com");
          Thread.sleep(3000);
         // driver.findElement(By.id("identifierId")).sendKeys("raghavendra.revanna@gmail.com");
         // driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
          //Thread.sleep(3000);
         // driver.findElement(By.name("password")).sendKeys("Parik@448");
         // driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

}
