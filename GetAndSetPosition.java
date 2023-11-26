package BasicMaven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAndSetPosition {
	public static void main(String[] args) {
		ChromeDriver dc = new ChromeDriver();
		EdgeDriver de = new EdgeDriver();
		FirefoxDriver df = new FirefoxDriver();
//	Point p = c1.manage().window().getPosition();
//	System.out.println(p);
//	c1.get("https://chat.openai.com/");

//		Point p1 = new Point(300, 200);
//		c1.manage().window().setPosition(p1);
//		c1.get("https://chat.openai.com/");

		Dimension d = new Dimension(200, 550);
		dc.manage().window().setSize(d);
		Point p = new Point(600, 300);
		dc.manage().window().setPosition(p);
		dc.get("https://chat.openai.com/");
		dc.close();

		Dimension d1 = new Dimension(400, 750);
		de.manage().window().setSize(d1);
		Point p1 = new Point(900, 460);
		de.manage().window().setPosition(p1);
		de.get("https://chat.openai.com/");
		de.close();

		Dimension d2 = new Dimension(300, 850);
		df.manage().window().setSize(d2);
		Point p2 = new Point(200, 160);
		df.manage().window().setPosition(p2);
		df.get("https://chat.openai.com/");
		df.close();
	}
}
