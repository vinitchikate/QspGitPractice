package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		Rectangle a = c1.findElement(By.name("login")).getRect();
		System.out.println(a.getWidth());
		System.out.println(a.getHeight());
		System.out.println(a.getX());
		System.out.println(a.getY());

	}
}
