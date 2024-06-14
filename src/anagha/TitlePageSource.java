package anagha;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePageSource {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		String expec = "Instagram";
		if(driver.getTitle().equals(expec)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.getPageSource();
		String expectedContent = "Get the app";
		if(driver.getPageSource().contains(expectedContent)) 
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.close();
	}

}
