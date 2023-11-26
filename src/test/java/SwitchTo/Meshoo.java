package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meshoo {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		;
		c1.get("https://www.meesho.com/");
		Thread.sleep(1000);
		WebElement value = c1.findElement(By.cssSelector("div[placeholder='Try Saree, Kurti or Search by Product Code']"));
		Thread.sleep(1000);
		value.sendKeys("shoes");
		Thread.sleep(1000);
		value.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
}
