package XpathByContain;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.naukri.com/");
		Thread.sleep(1000);
		c1.findElement(By.id("login_Layer")).click();
		Thread.sleep(1000);
		c1.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]")).click();// xpath
		Thread.sleep(1000);
		c1.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]"))
				.sendKeys("vinitchikate123@gmail.com"); // by
		// contain
		Thread.sleep(1000); // attribute
		c1.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]")).click();
		Thread.sleep(1000);
		c1.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]")).sendKeys("Vinit@123");
		Thread.sleep(1000);
		c1.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();// xpath by group contains
	}
}
