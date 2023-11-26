package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode3 {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://letcode.in/windows");
		c1.findElement(By.id("multi")).click();
		Set<String> secPage = c1.getWindowHandles();
		for (String a : secPage) {
			String b = c1.switchTo().window(a).getCurrentUrl();
			System.out.println(b);
			if (b.contains("https://letcode.in/dropdowns")) {
				// c1.close();

			}
		}
//		c1.findElement(By.id("accept")).click();) {

	}
}
