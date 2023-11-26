package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		c1.findElement(By.className("_30XB9F")).click();
		WebElement search = c1.findElement(By.name("q"));
		search.sendKeys("realme 11 Pro+ 5G (Oasis Green, 256 GB)");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		c1.findElement(By.xpath("(//div[text()='realme 11 Pro+ 5G (Oasis Green, 256 GB)'])[2]")).click();
		Thread.sleep(1000);
		Set<String> allWindows = c1.getWindowHandles();
		System.out.println(allWindows);

		for (String id : allWindows) {
			// String a = c1.getTitle();
			// System.out.println(a);
			String b = c1.switchTo().window(id).getTitle();
			System.out.println(b);
		}
		c1.findElement(By.cssSelector("button[class = '_2KpZ6l _2U9uOA _3v1-ww']")).click();
	}
}
