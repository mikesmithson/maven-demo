package com.ford.tools.demo.maven;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class MavenDemoTest {
	private MavenDemo demo;
	
	@Before
	public void setUp() {
		demo = new MavenDemo();
	}
	
	@Test
	public void when_passing_name_to_method_return_something() {
		assertThat("Hello there, Joe!", is(demo.awesomeDemoMethod("Joe")));
	}	
  
}
