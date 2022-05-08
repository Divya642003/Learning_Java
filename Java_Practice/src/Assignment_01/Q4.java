package Assignment_01;

public class Q4 {

	public static void main(String[] args) {
		classThree abd=new classThree(5);

	}

}
class classOne
{
   classOne(int a)
   {
       System.out.println("classOne"+a);
   }
}


class classTwo extends classOne{

   classTwo()
   {
       super(5);
       System.out.println("classTwo");
   }
}

class classThree extends classTwo
{
   classThree(int a)
   {
       super();
       System.out.println("classThree-parameterised"+a);
   }

   classThree ()
   {
       super();
       System.out.println("classThree-default");
   }
}