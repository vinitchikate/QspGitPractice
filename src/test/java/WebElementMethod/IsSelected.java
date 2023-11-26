package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.manage().window().maximize();
	c1.get("https://letcode.in/radio");
	Thread.sleep(1000);
	boolean a = c1.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
	Thread.sleep(1000);
	System.out.println(a);
	c1.manage().window().minimize();
}
}
