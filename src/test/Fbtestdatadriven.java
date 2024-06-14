package test;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pages.Fbpagedatadriven;
import utilities.Excelutil;

public class Fbtestdatadriven extends Baseclass{
	@Test
	public void verifyLoginWithValidCred() {
		Fbpagedatadriven p1 = new Fbpagedatadriven(driver);
		
//		Reading the data from excel file by specified path
		String xl = "D:\\\\datadriven.xlsx";
		String Sheet = "Sheet1";
		int rowCount = Excelutil.getRowCount(xl, Sheet);
		
		for(int i=1;i<=rowCount;i++) {
			String UserName=Excelutil.getCellValue(xl, Sheet, i, 0);
			System.out.println("username---"+ UserName);
			String Pwd = Excelutil.getCellValue(xl, Sheet, i, 1);
			System.out.println("password---"+ Pwd);
			
//			Passing username and pasword as parameters
//			Submitting the data by clicking on login button
//			p1.setvalues("", "");
			
			p1.setvalues(UserName, Pwd);
			p1.login();
		}
	}
}
