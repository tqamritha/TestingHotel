package org.Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\NewSelenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com");
		
		 String title =	driver.getTitle();
			System.out.println(title);
			
			WebElement user=driver.findElement(By.name("username"));
			user.sendKeys("bookdata");
			
			
	     	WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("Hotel@1234");
			
			WebElement button= driver.findElement(By.name("login"));
	         button.click();
	       
	         
	         WebElement search= driver.findElement(By.name("location"));
	         search.click();
	         
	         Robot rbt= new Robot();
	         
	         
	         for(int i=1;i<=5;i++)
	         {
	             rbt.keyPress(KeyEvent.VK_DOWN);
	             rbt.keyRelease(KeyEvent.VK_DOWN);
	         }
	       
	         Thread.sleep(2000);
	         
	         rbt.keyPress(KeyEvent.VK_ENTER);
	         rbt.keyRelease(KeyEvent.VK_ENTER);
	         
	         WebElement hotel=driver.findElement(By.name("hotels"));
	         hotel.click();
	         
	         for(int i=1;i<=4;i++)
	         {
	             rbt.keyPress(KeyEvent.VK_DOWN);
	             rbt.keyRelease(KeyEvent.VK_DOWN);
	         }
	       
	         Thread.sleep(2000);
	         
	         rbt.keyPress(KeyEvent.VK_ENTER);
	         rbt.keyRelease(KeyEvent.VK_ENTER);
	         
	         
	         WebElement room =driver.findElement(By.name("room_type"));
	         room.click();
	         
	         for(int i=1;i<=2;i++)
	         {
	             rbt.keyPress(KeyEvent.VK_DOWN);
	             rbt.keyRelease(KeyEvent.VK_DOWN);
	         }
	       
	         Thread.sleep(2000);
	         
	         rbt.keyPress(KeyEvent.VK_ENTER);
	         rbt.keyRelease(KeyEvent.VK_ENTER);
	         
	         WebElement roomNo= driver.findElement(By.name("room_nos"));
	         roomNo.click();
	         
	         for(int i=1;i<=2;i++)
	         {
	             rbt.keyPress(KeyEvent.VK_DOWN);
	             rbt.keyRelease(KeyEvent.VK_DOWN);
	         }
	       
	         Thread.sleep(2000);
	         
	         rbt.keyPress(KeyEvent.VK_ENTER);
	         rbt.keyRelease(KeyEvent.VK_ENTER);

	         
	         WebElement date=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	         date.click();
	         
	       //  date.sendKeys(Keys.TAB);
	         
	         Thread.sleep(2000);
	         
	         WebElement date1=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	         date1.sendKeys("19/09/2021");
	         
	         Thread.sleep(2000);
	         
	         //date1.sendKeys(Keys.TAB);
	        		 
	         WebElement adultRoom =driver.findElement(By.name("adult_room"));
	         adultRoom.click();
	         
	         for(int i=1;i<=2;i++)
	         {
	             rbt.keyPress(KeyEvent.VK_DOWN);
	             rbt.keyRelease(KeyEvent.VK_DOWN);
	         }
	       
	         Thread.sleep(2000);
	         
	         rbt.keyPress(KeyEvent.VK_ENTER);
	         rbt.keyRelease(KeyEvent.VK_ENTER);
	         
	         WebElement childRoom =driver.findElement(By.name("child_room"));
	           childRoom.click();
	           
	           
	           for(int i=1;i<=2;i++)
	           {
	               rbt.keyPress(KeyEvent.VK_DOWN);
	               rbt.keyRelease(KeyEvent.VK_DOWN);
	           }
	         
	           Thread.sleep(2000);
	           
	           rbt.keyPress(KeyEvent.VK_ENTER);
	           rbt.keyRelease(KeyEvent.VK_ENTER);
	        
	           
	          WebElement enter=driver.findElement(By.name("Submit"));
	          enter.click();
	          
	          WebElement redio = driver.findElement(By.name("radiobutton_0"));
	           redio.click();
	           
	           WebElement but1 = driver.findElement(By.name("continue"));
	           but1.click();
	           
	           Thread.sleep(2000);
	           
	           WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
	           firstName.sendKeys("Nayana");
	           
	           WebElement lastName= driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
	           lastName.sendKeys("Patil");
	           
	           WebElement address= driver.findElement(By.xpath("//*[@id=\"address\"]"));
	           address.sendKeys("nashik A14");
	           
	           WebElement card = driver.findElement(By.xpath("//*[@id=\"cc_num\"]"));
	           card.sendKeys("6789876545678976");
	           
	           WebElement cardType =driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
	           cardType.click();
	           
	           
	           for(int i=1;i<=2;i++)
	           {
	               rbt.keyPress(KeyEvent.VK_DOWN);
	               rbt.keyRelease(KeyEvent.VK_DOWN);
	           }
	         
	           Thread.sleep(2000);
	           
	           rbt.keyPress(KeyEvent.VK_ENTER);
	           rbt.keyRelease(KeyEvent.VK_ENTER);
	           
	           WebElement expDate = driver.findElement(By.name("cc_exp_month"));
	           expDate.click();
	           
	           for(int i=1;i<=6;i++)
	           {
	               rbt.keyPress(KeyEvent.VK_DOWN);
	               rbt.keyRelease(KeyEvent.VK_DOWN);
	           }
	         
	           Thread.sleep(2000);
	           
	           rbt.keyPress(KeyEvent.VK_ENTER);
	           rbt.keyRelease(KeyEvent.VK_ENTER);
	           
	           WebElement expDateYear = driver.findElement(By.name("cc_exp_year"));
	           expDateYear.click();
	           
	           for(int i=1;i<=6;i++)
	           {
	               rbt.keyPress(KeyEvent.VK_DOWN);
	               rbt.keyRelease(KeyEvent.VK_DOWN);
	           }
	         
	           Thread.sleep(2000);
	           
	           rbt.keyPress(KeyEvent.VK_ENTER);
	           rbt.keyRelease(KeyEvent.VK_ENTER);
	           
	           WebElement cvvNo = driver.findElement(By.name("cc_cvv"));
	           cvvNo.sendKeys("456");
	           
	           WebElement bookBut = driver.findElement(By.name("book_now"));
	           bookBut.click();
	           
	           

	
	}

}
