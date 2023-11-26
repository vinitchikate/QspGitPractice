package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://letcode.in/test");
		Thread.sleep(1000);
		c1.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(1000);
		boolean a = c1.findElement(By.id("fullName")).isEnabled();
		System.out.println(a);
		c1.manage().window().minimize();
	}
}
