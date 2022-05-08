package Assignment_01;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int array[]= new int[9];
		
		System.out.println("Input Number in the Array :");
		for(int i = 0 ;i<9; i++)
		{
			array[i]= scan.nextInt();
		}
		for(int i =0 ;i < 8 ; i++)
		{
			if (i>=3)
			{
				int temp = array[i];
				array[i]=array[i+1];
		
			}
		}
		array[8]=0;
		System.out.println("Final Array :");
		for(int i = 0 ;i<9; i++)
		{
			System.out.printf("\t %d ",array[i]);
		}
	}
}
