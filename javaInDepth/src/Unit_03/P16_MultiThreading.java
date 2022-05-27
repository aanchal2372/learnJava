package Unit_03;

import java.util.Scanner;

/*
 * MULTITHREADING PREQUISITES
 * 
 * MULTIPROCESSING->
 *   1.Sequential Multiprocessing.(one core and not used now(worst case))
 *   2.Parallel Multiprocessing.(best but no role of user(only used for increased in core but it is very expensive)
 *   3.Concurrent Multiprocessing.(best and there is also no role of user(only role to start the thread like start the movie,process etc and it is done by operating system and in this it done by context switch, program counter(more program counter more the efficiently of running code we use many programs as once in parallel multithreading)
 *   
 * MULTITASKING->
 *   1.Sequential Multitasking(30% important)
 *   2.Parallel Multitasking -> Not possible  
 *   3.Concurrent Multitasking(70% important)
 *   
 *   Multithreading is the solution when we running a process and it eventually stop bcz of user input then it will not run rest part of the program.So, for this we use multithreading bcz in this we divide it into small task and put each task to 
 *   each thread which is independently itself.
 */
public class P16_MultiThreading {

	public static void main(String[] args) {
//		abc2 obj=new abc2();
//		obj.threadConcept();
//		obj.threadSyncronization();
//		obj.interThreadCommunication();
//		obj.ProducerConsumerProblems();
//		obj.Wait_And_Notify();
//		c1 obj1=new c1();
//		c2 obj2=new c2();
//		obj1.show1();
//		obj2.show2();	
		Thread t1=new Thread(new T1(),"T1");
		Thread t2=new Thread(new T2(),"T2");
		Thread t3=new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class abc2{
	void threadConcept() {
		
	}
	void threadSyncronization() {
		
	}
	void interThreadCommunication() {
		
	}
	void ProducerConsumerProblems() {
		
	}
	void Wait_And_Notify() {
		
	}
}

class c1{
	void show1()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
	}
}
class c2{
	void show2()
	{
		for(int i=0;i<10;i++) {
		System.out.println("Hey-2");
		}
	}
}
class T1 extends Thread{
	public void run()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
	}
}
class T2 extends Thread{
	public void run()
	{
		
		for(int i=0;i<10;i++) {
		System.out.println("Hey-2");
		}
	}
}
class T3 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++) {
		System.out.println("Hey-3");
		}
	}
}