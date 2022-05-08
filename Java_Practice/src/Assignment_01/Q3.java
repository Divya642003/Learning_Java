package Assignment_01;
import java.util.Scanner;
public class Q3 {

	public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Input Number:");
        int p = scan.nextInt();
        testClass obj = new testClass();
        obj.display(p);
        scan.close();
    }
}

interface In1
{
    void display(int p);
}

class testClass implements In1
{
    public void display(int p)
    {
        int t=p/2;
        while(t>1)
        {
            if(p%t==0)
            {
                System.out.println(p+" is not prime");
                return;
            }
            t--;
        }
        System.out.println(p+" is prime");
    }

}
