package testng;

import org.testng.annotations.Test;

public class Parameters {
	@org.testng.annotations.Parameters("a")
	@Test
	public void main(String v) {
		System.out.println("value is "+v);
	}
}
