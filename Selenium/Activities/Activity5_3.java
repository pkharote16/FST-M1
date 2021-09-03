package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity5_3 {

    private static long TimeOut;

	public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Find the checkbox
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));

        //Print status
        System.out.println("The checkbox is selected: " + textInput.isEnabled());

        driver.findElement(By.id("toggleInput")).click();
        
        driver.manage().timeouts().implicitlyWait (5, TimeUnit.SECONDS);
       
        //Print status
        System.out.println("The checkbox is selected: " + textInput.isEnabled());

        
        Thread.sleep(3000);
        //Close the browser
        driver.close();

    }

}