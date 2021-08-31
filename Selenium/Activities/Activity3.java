package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		//fname
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Pooja");
		//System.out.println("fname: " + fname.getText());
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Kharote");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pkharote16@in.ibm.com");
		
		WebElement cName = driver.findElement(By.id("number"));
		cName.sendKeys("1234567890");
		
		Thread.sleep(3000);

		//submit
		WebElement submit1 = driver.findElement(By.cssSelector(".ui.green.button"));
		submit1.click();
		
		
		Thread.sleep(3000);
		//driver.navigate().refresh();
		driver.close();
}
}