package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://letcode.in/test");
		Thread.sleep(1000);
		c1.findElement(By.xpath("//a[text()='Tabs']")).click();
		Thread.sleep(1000);
		c1.findElement(By.id("multi")).click();
		Set<String> a = c1.getWindowHandles();
		Thread.sleep(1000);
		for (String s : a) {
			String b = c1.switchTo().window(s).getCurrentUrl();
			System.out.println(b);
		}
		c1.findElement(By.id("accept")).click();
	}
}
