package SwitchTo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flip2 {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		String currentTitle = c1.getTitle();
		System.out.println(currentTitle);

	}
}
