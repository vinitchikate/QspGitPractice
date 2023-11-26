package WebElementMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
//			 c1.findElement(By.className("_30XB9F")).click();
//			Thread.sleep(1000);
//			Dimension d1 = c1.findElement(By.name("q")).getSize();
//			System.out.println(d1.getHeight());
//			System.out.println(d1.getWidth());

			Dimension d2 = c1.findElement(By.xpath("//button[text()='Request OTP']")).getSize();
			System.out.println(d2.getHeight());
			System.out.println(d2.getWidth());

	}
}
