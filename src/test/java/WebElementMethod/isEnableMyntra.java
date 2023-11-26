package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableMyntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.myntra.com/");
		WebElement a = c1.findElement(By.cssSelector("input[class='desktop-searchBar']"));
		Thread.sleep(1000);
		a.sendKeys("Shoes");
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		c1.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
	}
}
