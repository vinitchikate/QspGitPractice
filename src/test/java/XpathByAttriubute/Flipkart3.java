package XpathByAttriubute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();

		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		c1.findElement(By.className("_30XB9F")).click();

		c1.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();

	}
}
