package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String t1= driver.getTitle();
		System.out.println("Title is:" +t1);
		
		//WebElement as = driver.findElement(By.xpath("html/body/div/div/div/div/form/div/div/input id"));
		//System.out.println("Path: " +as.getText());
		//as.click();
		// fname
		WebElement fname = driver.findElement(By.xpath("//input[@id = 'firstName']"));
		//System.out.println("fname: " +fname.getText());
		fname.sendKeys("Pooja");
		
		//lanme
		WebElement lname = driver.findElement(By.xpath("//input[@id = 'lastName']"));
		lname.sendKeys("Kharote");
		
		//email
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
		email.sendKeys("test@test.com");
		
		//number
		WebElement number = driver.findElement(By.xpath("//input[@id = 'number']"));
		number.sendKeys("1234567890");
		
		//
		WebElement msg = driver.findElement(By.xpath("//textarea"));
		msg.sendKeys("message ok!");
		
		
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
		//System.out.println("application submitted..!");	
		
				
		
		Thread.sleep(1000);
		driver.close();

}
}
