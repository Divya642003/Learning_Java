package Assignment_01;

public class Q7 {

	public static void main(String[] args) {
		 Employee1 o1=new Employee1();
	       Employee1 o2=new Employee1();
	       Employee1 o3=new Employee1();
	       Employee1 o4=new Employee1();

	       o1.display();
	       o2.display();
	       o3.display();

	       System.out.println("Number of objects created:"+Employee1.objCount);
	       System.out.println("Number of times display() called:"+Employee1.displayCount);

	    }
	}

	class Employee1
	{
	    static int objCount=0,displayCount=0;
	    Employee1()
	    {
	        objCount++;
	    }
	    void display()
	    {
	        displayCount++;	

	}

}
