package BasicMaven;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();

		Dimension d = new Dimension(200, 700);
		c1.manage().window().setSize(d);
		c1.get("https://chat.openai.com/");
		
	}
}
