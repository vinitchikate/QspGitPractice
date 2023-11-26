package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssigment {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.manage().window().maximize();
	c1.get("https://www.ajio.com/");
	WebElement a = c1.findElement(By.name("searchVal"));
	a.sendKeys("Wallet");
	a.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	c1.findElement(By.xpath("//option[text()='Price (highest first)']")).click();
}
}
