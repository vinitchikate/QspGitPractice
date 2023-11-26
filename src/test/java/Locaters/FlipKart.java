package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		c1.findElement(By.className("_30XB9F")).click();
//		WebElement searchF = c1.findElement(By.name("q"));
////		searchF.sendKeys("Mobile");
//////		searchF.sendKeys(Keys.ENTER);//to click on enter button
		
		//with using Css
		
		c1.findElement(By.name("q")).sendKeys("mobile");
		c1.findElement(By.className("_2iLD__")).click();
		
	}
}
