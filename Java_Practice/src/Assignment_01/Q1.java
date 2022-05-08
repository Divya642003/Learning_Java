package Assignment_01;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Student arr[] = new Student[6];
	for(int i=0; i<6 ;i++)
	{
		 System.out.println("Enter details of Student " +(i+1)+":");
         System.out.println("Enter Name:");
         String name=input.nextLine();
         System.out.println("Enter age:");
         String age=input.nextLine();
         System.out.println("Enter Section: A");
         System.out.println("Enter percentage:");
         float per=input.nextFloat();
         input.skip("\\R?");
         arr[i]=new Student(name,age,per);
	}
	input.close();
	
	
	float aver=Student.Average(arr);

    System.out.println("Average percentage of six students is:"+aver);

	}

}
class Student
{
	String name;
	String age;
	char section ;
	float per ;
	
	Student(String n ,String a,float p)
	{
		name =n;
		age = a;
		section ='A';
		per = p;
		System.out.println(n+ " " +a+ " " +section+ " " +p);	
	}
static public float Average(Student arr[])
{
	float avg =0.0f;
	for(int i=0;i<arr.length;i++)
	{
		avg = avg+arr[i].per;
	}
	avg= avg/arr.length;
	return avg;
}
		
}