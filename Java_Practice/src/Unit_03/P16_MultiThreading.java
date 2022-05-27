package Unit_03;
import java.util.*;
/*
 * Multiple processing
 *    sequential 
 *    parallel(is best among three)(it is expensive)
 *    concurrent(its not parallel but close to it)
 *    
 * Multiple tasking
 *    sequential 
 *    parallel(X)(NA)
 *    concurrent
 */
public class P16_MultiThreading {
     public static void main (String[] args)
	{
//		C1 obj1 = new C1();
//		C2 obj2 = new C2();
//		obj1.show1();
//		obj2.show2();
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();
	}
	
//	ABC obj = new  ABC();
//	obj.threadConcept(8); 
//	obj.threadSynchronization();
//	obj.interThreadCommunication();
//	obj.ProducerConsumerProblems();
//	obj.Wait_And_Notify();
}

//class ABC{
//	int threadConcept()
//	{
//		
//	}
//	int threadSynchronization()
//	{
//		
//	}
//	int interThreadCommunication()
//	{
//		
//	}
//	int ProducerConsumerProblems()
//	{
//		
//	}
//	
//	int Wait_And_Notify()
//	{
//		
//	}
//	
//}
class T1 extends Thread{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
	}
}


class T2 extends Thread
{
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Hey 2");
			
		}
		
	}
}

class C1{
	void show1()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
	}
}
class C2{
	void show2()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Hey 2");
			
		}
		
	}
}

class T3 extends Thread
{
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Hey 3");
			
		}
		
	}
}