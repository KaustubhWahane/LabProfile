/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - Lab assessment Question 1
*/
//declaring a class
class Program1
{
    static void printNumbers() 
	{
		int rows = 5; //Taking rows as a integer value as we have to print 1 to 5 numbers
		for (int i = 1; i <= rows; i++) //This is for row loop
		{
			for (int j = 1; j <= i; ++j) //This is for column loop
			{
				System.out.print(j + " ");
				
			}
			System.out.println();	//This is for row loop so they don't get mixed in column loop
		}
	}//calling the main method
	public static void main (String args [])
	{
		printNumbers();
	}
}