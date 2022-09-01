/*
Name - Kaustubh Wahane
Date - 1 Sept 2022
Program - Program 2
*/
//Importing java Scanner
import java.util.Scanner;
class SumOfOddEven
{
    public static void main(String ... args) 
    {
		//Taking two variables 
        int n, Sum1 = 0, Sum2 = 0;
		//Using the scanner class
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
		//Creating a new array
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
		//Creating a for 
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0) //Formula to find even and odd numbers	
            {
                Sum1 = Sum1 + a[i];
            }
            else
            {
              Sum2 = Sum2 + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+Sum1);
        System.out.println("Sum of Odd Numbers:"+Sum2);
    }
}