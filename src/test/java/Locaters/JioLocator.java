package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.jio.com/");
		Thread.sleep(1500);
		c1.findElement(By.partialLinkText("Mobile")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("True 5G")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("JioFiber")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("AirFiber")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("Business")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("Device")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("Apps")).click();
		Thread.sleep(1000);
		c1.findElement(By.partialLinkText("Support")).click();
		c1.manage().window().minimize();
		c1.close();
	}
}
