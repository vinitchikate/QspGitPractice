package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable2Oracale {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html");
		Thread.sleep(1000);
		c1.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		Thread.sleep(1000);
		boolean a = c1.findElement(By.xpath("(//div[@class='obttns'])[4]")).isEnabled();
		Thread.sleep(1000);
		System.out.println(a);
	}
}
