package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		Thread.sleep(1000);
		c1.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		c1.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(1000);
		Set<String> s = c1.getWindowHandles();
		System.out.println(s);
		Thread.sleep(1000);
		
		for (String id : s) {
			String a = c1.switchTo().window(id).getCurrentUrl();
			System.out.println(a);
		}
		c1.findElement(By.id("firstName")).sendKeys("Vinit");
		Thread.sleep(1000);
		c1.findElement(By.id("lastName")).sendKeys("Chikate");

	}
}
