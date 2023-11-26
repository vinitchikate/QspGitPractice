package WebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyrTutorial {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		c1.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(1000);
		// String s1 = c1.getWindowHandle();
		// System.out.println(s1);
		Set<String> s2 = c1.getWindowHandles();
		System.out.println(s2);
		Thread.sleep(1000);
//		c1.close();
//		Thread.sleep(1000);
		// c1.quit();
	}
}
