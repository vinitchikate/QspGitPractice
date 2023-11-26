package GetPageSource;

import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.manage().window().maximize();
	c1.get("https://www.linkedin.com/feed/");
	Thread.sleep(1000);
	String a = c1.getPageSource();
	System.out.println(a);
}
}
