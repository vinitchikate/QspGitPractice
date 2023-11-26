package XpathByGroup;
//back verse trave
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGrp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		 c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		c1.findElement(By.className("_30XB9F")).click();
		WebElement search = c1.findElement(By.name("q"));
		search.sendKeys("realme 11 Pro+ 5G (Oasis Green, 256 GB)");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// c1.findElement(By.xpath("(//div[text()='realme 11 Pro+ 5G (Oasis Green, 256
		// GB)'])[1]")).click();
		 c1.findElement(By.xpath("(//div[text()='₹21,999'])[1]")).click();
		 Thread.sleep(2000);
		 //c1.findElement(By.className("_1KOMV2")).click();
		 Thread.sleep(1000);
		c1.findElement(By.className("V3C5bO")).click();
//(//div[contains(text(),'realme 11 Pro+ 5G (Oasis Green, 256 GB)')])[1]/../..//div[@class='_30jeq3 _1_WHN1']
	}
}
