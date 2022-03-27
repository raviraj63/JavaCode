package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld implements I1,I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

}
