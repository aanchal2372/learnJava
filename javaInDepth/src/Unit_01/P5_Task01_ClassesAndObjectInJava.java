package Unit_01;

public class P5_Task01_ClassesAndObjectInJava {

	public static void main(String[] args) {
		ABC2 obj=new ABC2();
		obj.display2();
		ABC2.display();

	}

}

class ABC2{
    int a=10;
    //static int a=10;
	static int b=10;
	
	static void display() {           //b is also static in outside the method and for this if we want to access b inside the method  
		//int a=10;                   // then void display is compulsory to be static.both of them are need to be compulsory static.
		int b=10;                     //a is not static outside also so we cannot access in inside also.    
		b++;   
		//a++;
		
		//System.out.println(a);
		System.out.println(b);
	}
	
	void display2() {
		System.out.println(a);
		//As a was a local variable so we can can not access it outside the method.
		//System.out.println(b);
	}
}