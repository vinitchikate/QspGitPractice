package Locaters;

import org.openqa.selenium.chrome.ChromeDriver;

public class Messho {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.manage().window().maximize();
	c1.get("https://www.meesho.com/");
	Thread.sleep(2000);
}
}
