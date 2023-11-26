package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedFlip {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		c1.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		c1.findElement(By.cssSelector("img[alt='Travel']")).click();
		Thread.sleep(1000);
		boolean a = c1.findElement(By.xpath("(//div[@class='_1XFPmK'])[2]")).isSelected();
		Thread.sleep(1000);
		System.out.println(a);
	}
}
