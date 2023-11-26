package BasicMaven;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://chat.openai.com/");
		c1.manage().window().maximize();
		Dimension d1 = c1.manage().window().getSize();
		System.out.println(d1);
	}
}
