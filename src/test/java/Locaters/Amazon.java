package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.manage().window().maximize();
	c1.get("https://www.amazon.in/");
//	c1.findElement(By.id("twotabsearchtextbox")).sendKeys("RED GEAR");
//	c1.findElement(By.id("nav-search-submit-button")).click(
	c1.findElement(By.id("twotabsearchtextbox")).sendKeys("clock");
	Thread.sleep(2000);
	c1.findElement(By.cssSelector("div[aria-label='clock']")).click();
	c1.manage().window().minimize();
}
}
