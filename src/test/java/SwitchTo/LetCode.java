package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://letcode.in/test");
		Thread.sleep(1000);
		String firstPage = c1.getCurrentUrl();
		System.out.println(firstPage);
		c1.findElement(By.xpath("//a[text()='Tabs']")).click();
		Thread.sleep(1000);
		String secPage = c1.getCurrentUrl();
		System.out.println(secPage);
		c1.findElement(By.id("multi")).click();
		Thread.sleep(1000);
		String thirdPage = c1.getCurrentUrl();
		System.out.println(thirdPage);

	}
}
