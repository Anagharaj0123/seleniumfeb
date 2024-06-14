package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {
	@Before
	public void setup() {
		System.out.println("browser open");
	}
	
	@Test
	public void test() {
		System.out.println("test activity");
	}
	
	@Test
	public void test1() {
		System.out.println("test 2");
	}
	
	@After
	public void browserclose() {
		System.out.println("browser close");
	}

}
