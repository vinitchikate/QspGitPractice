package WebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://letcode.in/test");
		Thread.sleep(2000);
//		c1.findElement(By.linkText("Tabs")).click();
		c1.navigate().to("https://letcode.in/windows");
		Thread.sleep(1000);
		c1.findElement(By.id("multi")).click();
		Thread.sleep(1000);
//		String parentWindow = c1.getWindowHandle();
		Set<String> parentWindow = c1.getWindowHandles();
		System.out.println(parentWindow);
//		Thread.sleep(1000);
//		c1.close();
//		Thread.sleep(1000);
//		c1.quit();
	}
}
