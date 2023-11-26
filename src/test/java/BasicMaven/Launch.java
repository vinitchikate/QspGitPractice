package BasicMaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		ChromeDriver ch1 = new ChromeDriver();

		//ch1.manage().window().maximize();
		ch1.get("https://chat.openai.com/chat");
		//ch1.manage().window().minimize();
		ch1.manage().window().fullscreen();

	}
}
