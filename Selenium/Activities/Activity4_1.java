package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		String t1= driver.getTitle();
		System.out.println("Title is:" +t1);
		
		WebElement as = driver.findElement(By.xpath("/html/body/div/div/div/a"));
		System.out.println("Path: " +as.getText());
		as.click();
		
		Thread.sleep(1000);
		driver.close();

}
}