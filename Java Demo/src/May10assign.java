
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

		public class May10assign {

			public static void main(String[] args) throws AWTException, InterruptedException  {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\RaghavendraRevanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://realestate.upskills.in/wp-admin/");
		        driver.manage().window().maximize();
		        driver.findElement(By.id("user_login")).sendKeys("admin");
		        driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		        driver.findElement(By.name("login")).click();
		        WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		        Actions act = new Actions(driver);
		        //act.moveToElement(link).click().perform();
		        act.contextClick(link).build().perform();
		        Robot robot = new Robot();
		        robot.keyPress(KeyEvent.VK_DOWN);
		        Thread.sleep(2000);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(2000);
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        Thread.sleep(2000);
		        robot.keyPress(KeyEvent.VK_TAB);
		        System.out.println(driver.getCurrentUrl());
		        
		        
		        
			        		


			}

		}


	


