package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String str) {
		// Write Logic Here!
		int flag=0;
		 int i = 0, j = str.length() - 1;
		 while (i < j) {
	            if (str.charAt(i) != str.charAt(j))
	                flag=1;
	            i++;
	            j--;
	        }
	     if(flag==1)
	    	 System.out.println("String is not Palindrome");
	     else
	    	 System.out.println("String is Palindrome");
	     System.out.println();
	}

	void reverseOfAString(String str) {
		// Write Logic Here!
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }
		    System.out.print("Reverse Sring:");
		  System.out.println(rev);
		  System.out.println();
	}
	
	void stringEqualOrNot(String str1,String str2) {
		// Write Logic Here!
		 boolean retval = str2.equals(str1);
		 if(retval==false)
	      System.out.println("s1 is  not equal to s2  " );
		 else
			 System.out.println("s1 is  equal to s2  " );
			 
		
	}
}