import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaghavendraRevanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().window().maximize();
			WebElement link = driver.findElement(By.linkText("Car Rentals"));
			Actions MH = new Actions(driver);
			MH.moveToElement(link).click().build().perform();
			driver.navigate().back();
			org.openqa.selenium.interactions.Action mouseover = MH.moveToElement(link).build();
			mouseover.perform();
			MH.sendKeys(link,(Keys.ENTER)).perform();

	}

}
