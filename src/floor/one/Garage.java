package floor.one;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		Let’s think we are building a house. Our house has three floors.
//
//		On the First Floor, we have a Garage, Living room, and Bathroom.
//		
//		On the second floor, we have Kitchen, Master Bedroom, regular Bedroom.
//		
//		On the third floor, we have one room called the Game room.
//		
//		Each room has different properties: like below
//		
//		The garage has a capacity of two cars, an Exit door, and Enter a door to the house, Garage color is white.
//		
//		The living room has one door, the interior Color is Yellow, has two windows.
//		
//		The kitchen color is Purple, it has 8 kitchen closets, one Dishwasher, One refrigerator, and one stove.
//		
//		Master Bedroom has Two windows, One bed, one closet, and its color is Pink.
//		
//		Regular Bedroom has one window, One twin bed, half closet, and its color is Gray.
//		
//		The game room has 4 windows, 2 ping pong tables, Two TVs, and one Play Stations. 8 chairs and one dining table.
//		
//		After reading the above information about this House. Follow the below steps for this practice:
//		
//		Create a java project and name it My House Project
//		
//		Create a package for each floor and name them as to
//		
//		floor. one
//		
//		floor. two
//		
//		floor. three
//		
//		
//		Based on the above information create separate classes under each package for each room, garage, and kitchen.
//		
//		Once you have classes created start storing properties of each room in that class, for example:
//		
//		
//		Garage Color can be defined as String garage color = “White”; in Class Garage underfloor.one package. Or Number of doors can be stored in a variable like int numberOfGarageDoor = 2;
//		
//		Note: make sure every class you create has the main method. And you print each variable value in the console.
//		
//		The main purpose of this exercise is to understand how to create a project, package, Class, and using different data types, and practice naming conventions.
//		
//		Please do not use hard code values, please be mindful of naming convention, and syntax.
//		Good Luck
		
		int garageCapacity = 2;
		int exitDoor = 1;
		String garageColor = "white";
		String totalOfDoors = "One Enter and  One Exit Door";
		
		System.out.println("My House's Garage Info:"+"\nGarage Capacity: "+garageCapacity + "\nNumber Of Exit Door: "+ exitDoor) ;
	}

}
