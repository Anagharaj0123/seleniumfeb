package sele;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleContentVerification {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 String actualcontent = driver.getPageSource();
		 if(actualcontent.contains("Gmail")) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		 driver.close();
	}

}
