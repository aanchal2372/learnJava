package Unit_03;

import java.util.*;
public class sampleClass {
//if there is a exception in try block but there is no appropriate catch block to catch the exception still finally would run.
//if there is no exception or exception ,still the finally run.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sensitive code
		
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		finally {                              
		System.out.println("Done!");
		}
	}
}
class ABCDE{
	
	void inputMismatchException() {
		Scanner sr=new Scanner(System.in);
		try
		{
			int a=sr.nextInt();
			System.out.println(a);
			sr.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch Issue!");
		}
		sr.close();
		System.out.println("Done!");
	}
	//use of throw
	void mauallyThrowAnExceptionFromYourCode(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("AccessDEnied-You must be an 18");
			}
			else
			{
				System.out.println("Access grated you are old enough");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    
	void stackOverflowError(int a){
		try {
			while(a>0)
			{
				a++;
				stackOverflowError(a);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	void indexOutofBoundExceptionPart1()
	{ 	int []myNumbers= {1,2,3};
		System.out.println(myNumbers[10]);//out of index
	}
	void indexOutofBoundExceptionPart2()
	{
		try
		{
			int []myNumbers= {1,2,3};
			System.out.println(myNumbers[10]);
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		//the finally statement lets you execute code after try catch rgardless opf result
		finally
		{
			System.out.println("the try catch is finished");
		}
	}
	/*lazy binding-it doesn't handle exception itself but throw an exception */
	void useOfThrow(int age) throws Exception{//u can use many exception by putting comma
		
		if(age<18)
		{
			throw new Exception();
		}
		else
		{
			System.out.println("you are allowed to enter");
		}
	}
	
	
}