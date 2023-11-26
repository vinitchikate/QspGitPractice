package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String a = c1.findElement(By.name("login")).getCssValue("background-color");
		System.out.println(a);
	}
}
