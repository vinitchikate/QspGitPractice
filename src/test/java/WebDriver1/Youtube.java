package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com/");
		WebElement searchF = c1.findElement(By.id("APjFqb"));
		searchF.sendKeys("youtube");
		Thread.sleep(1000);
		searchF.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		c1.findElement(By.xpath("//h3[text()='YouTube: Home']")).click();
		Thread.sleep(1000);
		WebElement youtubeSearch = c1.findElement(By.name("search_query"));
		Thread.sleep(1000);
		youtubeSearch.sendKeys("Elevated");
		Thread.sleep(1000);
		youtubeSearch.sendKeys(Keys.ENTER);
	}
}
