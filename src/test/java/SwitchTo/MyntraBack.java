package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraBack {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.myntra.com/");
		WebElement a = c1.findElement(By.className("desktop-searchBar"));
		Thread.sleep(1000);
		a.sendKeys("titan men watch");
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		c1.findElement(By.xpath("//span[text()='10845']")).click();
		Thread.sleep(1000);
		Set<String> x = c1.getWindowHandles();
		System.out.println(x);

		for (String id : x) {
			String b = c1.switchTo().window(id).getTitle();
			System.out.println(b);
		}
		// clr+shift+i
		Thread.sleep(1000);
		c1.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();

		for (String id : x) {

			String b = c1.switchTo().window(id).getTitle();
			if (b.contains("Titan Men Watch - Buy Titan Men Watch online in India")) {
				Thread.sleep(1000);
				c1.navigate().back();
			}
		}
	}
}
