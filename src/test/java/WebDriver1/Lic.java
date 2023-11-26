package WebDriver1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lic {
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.navigate().to("https://licindia.in/web/guest/pension-group-schemes");
	}
}
