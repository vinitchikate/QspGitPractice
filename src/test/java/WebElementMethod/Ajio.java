package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.ajio.com/");
		Thread.sleep(1000);
		String a = c1.findElement(By.name("searchVal")).getAttribute("class");
		Thread.sleep(1000);
		System.out.println(a);
	}
}
