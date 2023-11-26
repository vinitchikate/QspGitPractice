package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		c1.findElement(By.partialLinkText("Forgotten password")).click();

	}
}
