/*Write a program to print Floyd’s triangle where n is command line input.
1
2 3
4 5 6
7 8 9 10
.....
N*/
import java.util.*;
class ptn
{
	public static void main(String[] args)
	{
		int n;
		int i, j, k = 1;
		Scanner s=new Scanner(System.in);
        System.out.print("Enter Number:-");
        n=s.nextInt();

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++) 
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}
