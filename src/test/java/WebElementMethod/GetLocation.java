package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		Thread.sleep(1000);
		c1.get("https://www.amazon.in/");
		Thread.sleep(1000);
		Point searchF = c1.findElement(By.id("twotabsearchtextbox")).getLocation();
		Thread.sleep(1000);
		System.out.println(searchF.getX());
		System.out.println(searchF.getY());

	}
}
