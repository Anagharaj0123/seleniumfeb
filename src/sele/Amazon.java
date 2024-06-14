package sele;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expected = "Amazon";
		if(actualTitle.equals(expected)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		//content
		String actualcontent = driver.getPageSource();
//		System.out.println(driver.getPageSource());
		if(actualcontent.contains("sign in")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	}

}
