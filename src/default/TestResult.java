package com.example;


 public class TestResult extends TestOveriding implements TestInterface
{
	@Override
	public void test() {
		System.out.println("in TestResult class...");
	}
	 
	public static void main(String args[]) {
		
		TestInterface in= new TestResult();
		
		TestResult result =new TestResult();
		result.test();
		
		System.out.println("main...");
	}
	
}
 
 interface TestInterface{
	 static final int t=0;
		
	private	static void ghel() {
			System.out.println("hello");
		}
	

	}
 
 class TestOveriding{
	  public void  test() {
		  System.out.println("its in TestOverriding class..");
	  }
 }

