package sele;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//to close automatically 2 methods are there
//		driver.close(); //to close current window
//		driver.quit(); //to close entire browser
		String actual = driver.getTitle();
		String expec = "Google";
		if(actual.equals(expec)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("test failed");
		}
	}
}
