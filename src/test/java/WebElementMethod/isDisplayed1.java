package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		boolean a = c1.findElement(By.name("login")).isDisplayed();
		boolean b = c1.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).isDisplayed();
		Thread.sleep(1000);
		System.out.println(a);
		Thread.sleep(1000);
		c1.manage().window().minimize();
		System.out.println(b);

	}
}
