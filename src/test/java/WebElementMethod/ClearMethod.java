package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement userName = c1.findElement(By.id("username"));
		Thread.sleep(1000);
		userName.clear();
		Thread.sleep(1000);
		userName.sendKeys("Vinit");
		Thread.sleep(1000);
		WebElement password = c1.findElement(By.id("password"));
		Thread.sleep(1000);
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("Vinit@111");
	}
}
