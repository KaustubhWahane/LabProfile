/*
Name - Kaustubh Wahane
Date - 1 Sept 2022
Program - Program 3
*/
class Constructor
{
    int length;
    int breadth;

//This is the first constructor without any values (Default constructor)
		public Constructor()
		{ 
			int length = 0;
			int breadth = 0;

		}
//This constructor is having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
		public Constructor(int length)
		{
			this.length = 4 ;
			 breadth = 5;
		}
//This is the third having one number as parameter - both length and breadth are assigned that number then create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
			public Constructor(int length,int breadth)
			{
				this.length = 7;
				this.breadth = 8;
			}
				public void  Area()
				{
					System.out.println(length*breadth);
				}
}
 class Rectangle
{
	// This is where the class will call all the constructor to perform various tasks
		public static void main(String[] args)
		{
			Constructor obj = new hello();
			obj.Area();
			Constructor obj1= new Constructor(10);
			obj1.Area();
			Constructor2 obj2 = new Constructor2(12,2);
			obj2.Area();


		}
}


  
  