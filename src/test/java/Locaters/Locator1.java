package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://letcode.in/test");
		c1.findElement(By.linkText("Sign up")).click();
		c1.findElement(By.id("name")).sendKeys("Pune");
		c1.findElement(By.id("email")).sendKeys("pune@gmail.com");
		Thread.sleep(2000);
		c1.findElement(By.id("pass")).sendKeys("123456789");
		c1.findElement(By.id("agree")).click();
		c1.findElement(By.tagName("button")).click();

	}
}
