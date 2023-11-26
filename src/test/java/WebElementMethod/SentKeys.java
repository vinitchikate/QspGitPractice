package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SentKeys {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		WebElement a = c1.findElement(By.id("email"));
		Thread.sleep(1000);
		a.sendKeys("vinitchikate123@gmail.com");
		Thread.sleep(1000);
		a.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		a.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(1000);
		c1.findElement(By.id("pass")).sendKeys(Keys.CONTROL + "v");
	}
}
