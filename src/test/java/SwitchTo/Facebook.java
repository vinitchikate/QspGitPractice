package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		c1.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1500);
		String url = c1.getCurrentUrl();
		System.out.println(url);
	}
}
