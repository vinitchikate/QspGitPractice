package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		c1.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		WebElement w1 = c1.findElement(By.className("Pke_EE"));
		Thread.sleep(1000);
		w1.sendKeys(
				"realme Buds Air 5 Pro with 50dB ANC, 360 Spatial Audio and upto 40 hours Playback Bluetooth Headset  (Astral Black, True Wireless)");
		Thread.sleep(1000);
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		c1.findElement(By.xpath("(//a[text()='realme Buds Air 5 Pro with 50dB ANC, 360 Spatial Audio ...'])[1]"))
				.click();
		Set<String> s1 = c1.getWindowHandles();
		System.out.println(s1);

		for (String id : s1) {
//			String a = c1.getTitle();//it is fetching the same title
//			System.out.println(a);
			String b = c1.switchTo().window(id).getTitle();
			System.out.println(b);
		}
		Thread.sleep(1000);
		c1.findElement(By.cssSelector("button[class = '_2KpZ6l _2U9uOA _3v1-ww'] ")).click();
	}
}
