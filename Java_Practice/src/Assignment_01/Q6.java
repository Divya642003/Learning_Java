package Assignment_01;
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter a :");
	int a = scan.nextInt();
	System.out.println("Enter b :");
	int b = scan.nextInt();
	
	int result = (a>b)?test.add(a,b):test.sub(a,b);
	System.out.println("result is  :"+result);
}
}

class test{
	
	static public int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	static public int sub(int a,int b)
	{
		int dif = a-b;
		if(dif<0)
		{
			return 0;
		}
		else
		return dif;
	}
}