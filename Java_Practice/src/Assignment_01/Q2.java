package Assignment_01;

public class Q2 {
	public static void main(String[] args) {
          Number obj1 = new Number();
          Number obj2 = new Number();
          Number obj3 = new Number();
          
          System.out.println("the total number of calls for a memeber function");
          System.out.println(Number.count);
}
}
 class Number{
static public int count=0;
	Number()
	{
		count++;
	}
}