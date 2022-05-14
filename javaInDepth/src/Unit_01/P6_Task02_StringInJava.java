package Unit_01;

public class P6_Task02_StringInJava {

	public static void main(String[] args) {
		StringInJava obj=new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
	}
}

class StringInJava{
	void StringDefinition() {
		String s="Hello There";
		String s1=new String("flower");
		
		System.out.println(s);
		
		//Get length of a string
		System.out.println(s.length());
		
		//loop through a string
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		String first="Aanchal";
		String second="Tiwari";
		
		//Add two Strings
		String third=first+second;
		System.out.println(third);
		
		//compare two strings
		boolean result1=first.equals(second);
		System.out.println(result1);
		
		/*Java strings are Immutable
		 * In java,the JVM maintains a string poll to store all of its strings inside the memory.
		 * The string pool helps in reusing the strings.
		     -If the string already exists,the new string is not created.
		     -Instead,the new reference ,exampke points to the already existed string(java).
		     -If the string doesn't exist,the new string(Java is created).
		 */
		String fourth="Aanchal";
		String fifth=new String("Tiwari");
	}
	
	//Character arrays are muatable but strings are not.
	
	void charAndString() {
		char[] ch= {'H','e','l','l','o',' ','T','h','e','r','e'};
		char[] ch2= {'!','!'};
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		String s1=new String(ch);
		System.out.println(s1);
		
		//character arrays are mutable but the strings are not
		ch[0]='h';
		//s1.charAt(0)='h';
		
		//Join two java strings -+' can be used to appended strings together to form a new string -but not possible in char array
		
		s1=s1+'a';   //s1 is new object with the new memory
		//ch=ch+ch2;
		
		//String to char array
		String s2="GEEKS";
		char[] ch4=s2.toCharArray();
		
		//char array to string
		char[] a2= {'A','A','N'};
		String s3=new String(a2);
	}
	
}