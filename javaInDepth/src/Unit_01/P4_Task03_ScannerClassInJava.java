package Unit_01;

import java.util.Scanner;

/*
   *when user takes the input from the user.
   *nextLine()  =  Read user input[to read strings] 
   *next()      =  Read next token from the input entered by the user.
   *nextBoolean()= Read a boolean value from the user.
   *nextByte()   = Read a byte value from the user.
   *nextDouble() = Read a double value from the user.
   *nextFloat()  = Read a float value from the user.
   *nextInt()    = Read a int value from the user.
   *nextLine()   = Read a string value from the user.
   *nextLong()   = Read a long value from the user.
   *nextShort()  = Read a short value from the user.
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		Scanner myObj1=new Scanner(System.in);  //create a scanner object
		Scanner myObj2=new Scanner(System.in);
		
		//Read the first token:(_space bar)
		String firstname=myObj1.next();
		System.out.println("Name is:"+firstname+"\n");
		
		String name=myObj2.nextLine();
		String name2=myObj2.nextLine();
		
		System.out.println("Name is:"+name+"\n");
		System.out.println("Name is:"+name2+"\n");
		
		boolean b=myObj2.nextBoolean();
		System.out.println(b+"\n");
		
		myObj1.close();
		myObj2.close();

	}

}
