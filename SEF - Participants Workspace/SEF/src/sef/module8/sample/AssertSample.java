package sef.module8.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
//edit configuration/modify options/add vm options/ add -ea in VM arguments
public class AssertSample {

	public static void test()
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
		assert 5%2 == 1;
		assert 6%2 == 1 : "Wrong assertion message";
	}
	public static void main(String arg[]){
		//2 - Call test()
		AssertSample.test();
		
	}			
}
