package Unit_01;
/*3 ways:
 * StringBuffer()
 * StringBuffer(string str)
 * StringBuffer(int capacity)
 * StringBuffer is mutable unlike string
 */

public class P6_Task03_StringBufferClassInJava {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb.charAt(0));
		
		//StringBuffer class append() method,now original string is changed
		System.out.println(sb);
		
		//StringBuffer insert() method
		StringBuffer sb2=new StringBuffer("Hello ");
		sb2.insert(1, "Java");  //now original string is changed
		System.out.println(sb2);  //prints Hjavaello
		
		//StringBuffer replace() method
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.replace(1, 3, "Java");
		System.out.println(sb3);     //prints HJavalo
		
		//StringBuffer delete() method
		StringBuffer sb4=new StringBuffer("Hello");
		sb4.delete(1, 3);
		System.out.println(sb4);    //prints hlo
	}
}
