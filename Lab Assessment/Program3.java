/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - Lab assessment Question 3
*/
//declaring a class
class RemoveDuplicateInArray
{  
	static int removeDuplicateElements(int arr[], int n) //I have removed the void and used a integer 
	{  
		//Condition
        if (n == 0 || n == 1)
		{  
            return n;  
        }  
        int temp[] = new int[n];  //temp is temprorary variable
        int j = 0;  
        for (int i=0; i<n-1; i++)
		{  
            if (arr[i] != arr[i+1])
			{  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  // The return type is here with a j variable
    }  
       
    public static void main (String[] args) 
	{  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  