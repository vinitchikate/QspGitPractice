package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		Thread.sleep(1000);
		c1.get("https://www.myntra.com/");
		WebElement a = c1.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']"));
		Thread.sleep(1000);
		System.out.println(a.getTagName());
	}
}
