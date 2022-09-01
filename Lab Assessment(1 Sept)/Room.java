/*
Name - Kaustubh Wahane
Date - 1 Sept 2022
Program - Program 1
*/
//Declaring a class
class Room 
{
	//Setting each data type to private
	private int roomNo;
	private	String roomType;
	private float roomArea;
	private boolean acMachine;
	
	//Making this method to setData
		void setData(int rno, String rt, float area, boolean ac) 
		{
			roomNo = rno;
			roomType = rt;
			roomArea = area;
			acMachine = ac;
		}
		//All data typed will be done through this method
			void displayData()
			{
				System.out.println("The room.Is" + roomNo);
				System.out.println("The room Type is"+ roomType);
				System.out.println("The room area is" + roomArea);
				String s = (acMachine) ? "yes" : "no";
				System.out.println("The A / c Machine needed" + s);
			}
		
}
class RoomTest
{
	public static void main(String args[]) 
	{
		//Creating a new object 
		Room room1 = new Room();
		//Applying the data to the respective variable
		room1.setData(50, "Deluxe", 240.0f , true);
		//Calling all the methods
		room1.displayData();
		setData();
		displayData();
	}
}