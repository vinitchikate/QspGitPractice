package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		c1.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		c1.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(1000);
		c1.navigate().back();
		Thread.sleep(1500);
		c1.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		Thread.sleep(1000);
		c1.navigate().back();
		Thread.sleep(1000);
		c1.navigate().forward();
		c1.navigate().back();
		Thread.sleep(1000);
		c1.navigate().forward();
		c1.navigate().back();
		Thread.sleep(1000);
		c1.navigate().forward();
		c1.navigate().back();
		Thread.sleep(1000);
		c1.navigate().forward();
		c1.navigate().back();
		Thread.sleep(1000);
		c1.navigate().forward();
		c1.navigate().back();
		Thread.sleep(1000);
		c1.navigate().forward();
		Thread.sleep(2000);
		c1.navigate().refresh();
	}
}
