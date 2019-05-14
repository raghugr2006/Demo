import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class May13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaghavendraRevanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        WebElement label1 = driver.findElement(By.xpath("//*/tbody/tr/td"));
        System.out.println(label1.getText());
	}
}
