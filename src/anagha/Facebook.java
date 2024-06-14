package anagha;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String expec = "Facebook – log in or sign up";
		if(driver.getTitle().equals(expec)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		String expecContent = "Log in";
		if(driver.getPageSource().contains(expecContent)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
	}

}
