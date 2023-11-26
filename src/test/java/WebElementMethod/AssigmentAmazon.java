package WebElementMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentAmazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement a = c1.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("boat airdopes");
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		c1.findElement(By.xpath("//span[text()='boAt Newly Launched Airdopes 141 ANC TWS Earbuds With 32 dB ANC, 42 HRS Playback, 50ms Low Latency Beast™ Mode, IWP™ Tech,Signature Sound,Quad Mics with ENx™,ASAP™ Charge,USB Type-C Port & IPX5(Green)']")).click();
		Thread.sleep(1000);
		Set<String> b = c1.getWindowHandles();
		System.out.println(b);
		for (String id : b) {
			Thread.sleep(1000);
			String x = c1.switchTo().window(id).getTitle();
			System.out.println(x);
		}
		Thread.sleep(1000);
		c1.findElement(By.name("3")).click();
	}
}
