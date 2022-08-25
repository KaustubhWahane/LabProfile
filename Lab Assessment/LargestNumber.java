/*
Name - Kaustubh Wahane
Date - 24 Aug 2022
Program - Lab Assessment Question 2
*/
//declaring a class
class ArrayDemo
{
	static void largestElement(int ...array)
	{
		//It is used for calculating the size
		int size  = array.length;
		System.out.println("The size is: " + size);
		//Printing all the elements of the array
		for (int i :array)
		{
			System.out.println(i);
		}
		int tempVariable; //Used for sorting the array
		for (int j = 0; j < size; j++)
		{
			for (int k = j+1; k < size; k++)
			{
				if (array [j] > array [k])
				{
					tempVariable = array[j];
					array[j] = array[k];
					array[k] = tempVariable;
				}
			}
		}//This is where the sorting of numbers end
		System.out.println("Largest elements is: " + array.length(size - 1));
		System.out.println("Second Largest elements is: " + array.length(size - 2));
	}
	public static void main (String args[])
	{
		largestElement(45, 643, 12 ,75, 90, 5);
	}
}