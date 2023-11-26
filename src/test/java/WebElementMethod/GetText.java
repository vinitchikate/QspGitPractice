package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		String a = c1.findElement(By.cssSelector("h2[class='_8eso']")).getText();
		Thread.sleep(1000);
		System.out.println(a);
	}
}
