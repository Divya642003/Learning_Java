package Assignment_01;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of employee:");
        int n=scan.nextInt();
        scan.skip("\\R?");
        Employee arr[]=new Employee[n];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter details of Employee:");
            System.out.println("Name:");
            String name=scan.nextLine();
            System.out.println("Age:");
            String age=scan.nextLine();
            System.out.println("Department:");
            String depart=scan.nextLine();
            System.out.println("Salary:");
            double salary=scan.nextDouble();
            scan.skip("\\R?");
            arr[i]=new Employee(name,age,depart,salary);
            
        }

        scan.close();
        Employee.calculate("A",arr);
        Employee.calculate("B",arr);
        Employee.calculate("C",arr);
        Employee.calculate("D",arr);

    }
}


class Employee
{
     String name;
     String age;
     String depart;
     double salary;

     Employee(String name, String age, String depart, double salary)
     {
         this.name=name;
         this.age=age;
         this.depart=depart;
         if(salary>30000)
         {
             this.salary=25000;
         }
         else
         {this.salary=salary;}
     }

     static void calculate(String depart,Employee arr[])
     {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].depart.equals(depart))
            {
                sum+=arr[i].salary;
            }
        }
        System.out.println("Salary to be paid in "+depart+"department is:"+sum);
     }


	

}

