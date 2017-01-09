package com.maven;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class Tests {
	@SuppressWarnings("deprecation")
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("maven");
		assertEquals("Hello maven £¡", results);
	}
}