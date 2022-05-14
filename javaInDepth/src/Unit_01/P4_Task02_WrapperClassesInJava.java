package Unit_01;

/* 
   *The Wrapper class in Java provides the mechanism to convert primitive into object.
   *why?
   *Because we want to use predefined methods of those objects.
   *boolean data types-> boolean obj:-> obj.tostring(); 
 */
public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		//Converting int into integer
		int a=20;
		String s="" + a + "";
		
		Integer i=Integer.valueOf(a); //converting int into integer explicitly.
		Integer j=a;  //autoboxing ,now complier will write Integer.valueOf(a) internally.
		
		System.out.println(a + "" + i + "" + j);
		
		System.out.println(i.toString());
		
		//a.toString() can not be done due to its int not objects.
		
		//Autoboxing: Converting  primitives into onjects.
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing: Converting objects to primitives.
		byte bytevalue=byteobj;
		System.out.println(bytevalue);

	}

}
