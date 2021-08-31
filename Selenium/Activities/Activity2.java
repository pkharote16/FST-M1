package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		//driver.getTitle();
		//driver.findElement text1
		//title
		String title = driver.getTitle();
		System.out.println("Page Title is: " +title);

		//id
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in Element1: " + idLocator.getText());
		
				// link text
		WebElement text1 = driver.findElement(By.linkText("About Us"));
		System.out.println("Link Text is: " +text1.getText());
		
		text1.click();
		driver.navigate().back();
		
        WebElement classNameLocator = driver.findElement(By.className("green"));    	
        System.out.println("Text in element2: " + classNameLocator.getText());
        
        
        //css
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));    	
        System.out.println("Text in element3: " + cssLocator.getText());
        
        boolean status = cssLocator.isDisplayed();
        System.out.println("status is: " +status);
        
        
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}

}
