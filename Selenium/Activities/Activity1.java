package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		
		String URL1 = "https://www.training-support.net/";
				// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get(URL1);
			WebElement Nav1 = driver.findElement(By.id("nav1"));
			Thread.sleep(1000);
			driver.close();
	}

}
