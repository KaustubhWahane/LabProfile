/*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program - Nested for loops Demo
*/ 
class PalindromeExample
{
	static void Palindrome()
	{  
	  int r, sum = 0, temp;    
	  int n =454;//It is the number variable to be checked for palindrome  
	  
	  temp = n;    
	  while(n>0)
	  {    
	   r=n%10;  //getting remainder  
	   sum=(sum*10) + r;    
	   n = n/10;    
	  }    
		if(temp==sum)    
			System.out.println("It is a Palindrome number ");    
			else    
				System.out.println("It is not a palindrome");    
	} public static void main (String args[])
		{
			Palindrome();
		}
}