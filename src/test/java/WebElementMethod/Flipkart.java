package WebElementMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		c1.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		Dimension size = c1.findElement(By.cssSelector("input[class='Pke_EE']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}
}
