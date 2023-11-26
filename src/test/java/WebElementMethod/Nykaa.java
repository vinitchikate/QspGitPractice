package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.nykaa.com/");
		WebElement a = c1.findElement(By.cssSelector("input[class='css-1upamjb']"));
		a.sendKeys("sunglass");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		c1.findElement(By.xpath("(//div[@class='css-xdicx1'])[2]")).click();
		Thread.sleep(1000);
		c1.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();

	}
}
