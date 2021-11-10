package phptravels;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravelsAutomation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver obj=new ChromeDriver();
		
		//1. URL visit
		obj.get("https://www.phptravels.net/");
		Thread.sleep(1000);
		obj.manage().window().maximize();
		
		//2. Select tour from search bar
	    obj.findElement(By.id("tours-tab")).click();
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		// Click on select on the city
		r.keyPress(KeyEvent.VK_ENTER);
		
        //3. Input Johor Bahru as destination
		obj.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Johor");
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		//4. Future date select
		obj.findElement(By.xpath("(//td[contains(text(),'15')])[8]")).click();
		
		//traveler button click
		obj.findElement(By.xpath("//form[@id='tours-search']//p[1]")).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);		
		r.delay(1000);
		
		//5. Make adult count 2
		r.keyPress(KeyEvent.VK_2);
		r.delay(2000);
		
		//6. search
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(2000);

		obj.findElement(By.id("cookie_stop")).click();
		
	    //7. click on the detail button
		WebElement details=obj.findElement(By.xpath("//li[@id='legoland malaysia day pass']//div//div//div//div//div//a"));
		JavascriptExecutor j=(JavascriptExecutor)obj;
		j.executeScript("arguments[0].click();", details);
		
		//8. click on the booknow button
		WebElement booknow=obj.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)obj;
		js.executeScript("arguments[0].click();", booknow);
		
		//First name textbox
		obj.findElement(By.name("firstname")).sendKeys("Abrar");
		
		//last name textbox
		obj.findElement(By.name("lastname")).sendKeys("Mannan");
		
		//email textbox
		obj.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		
		//phone number textbox
		obj.findElement(By.name("phone")).sendKeys("015434567");
		
		//address textbox
		obj.findElement(By.name("address")).sendKeys("Dhaka");
		
		//traveller1 First name textbox
		obj.findElement(By.name("firstname_1")).sendKeys("Abdul");
		
		//traveller1 last name textbox
		obj.findElement(By.name("lastname_1")).sendKeys("Mannan");
		

		//traveller2 First name textbox
		obj.findElement(By.name("firstname_2")).sendKeys("Ziad");
		
		//traveller2 last name textbox
		obj.findElement(By.name("lastname_2")).sendKeys("Mohib");
		

		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_DOWN);
		WebElement checkbox=obj.findElement(By.id("agreechb"));
		JavascriptExecutor jse=(JavascriptExecutor)obj;
		jse.executeScript("arguments[0].click();", checkbox);
		
		//9. click on the confirm button
		WebElement confirm=obj.findElement(By.id("booking"));
		JavascriptExecutor jss=(JavascriptExecutor)obj;
		jss.executeScript("arguments[0].click();", confirm);


		



	}

}
