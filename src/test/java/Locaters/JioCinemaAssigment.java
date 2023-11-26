package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioCinemaAssigment {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.manage().window().maximize();
	c1.get("https://www.jiocinema.com/");
	Thread.sleep(2000);
	c1.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-19vq5pf-aWeb-aWebText'])[1]")).click();
	Thread.sleep(2000);
	c1.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-19vq5pf-aWeb-aWebText'])[2]")).click();
	Thread.sleep(2000);
	c1.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-19vq5pf-aWeb-aWebText'])[3]")).click();
	Thread.sleep(2000);
	c1.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-19vq5pf-aWeb-aWebText'])[4]")).click();
	Thread.sleep(2000);
	c1.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-19vq5pf-aWeb-aWebText'])[5]")).click();
	Thread.sleep(2000);
}
}
