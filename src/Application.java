//Enums (short for enumeration) represent fixed values of things (constants)
//like, you can create an enum Week, whose members are the 7 days
//to create: rt click src-- new-- enum
//you have to raise preference-- java-- compiler to 1.5
//still not working :(
//can't create it manually either. wth?
//see notes below


public class Application {
	
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int RAT = 2;
	

	public static void main(String[] args) {
		
		int animal = CAT;
		
		switch(animal){
		case DOG:
			System.out.println("Bark!");
			break;
		case CAT:
			System.out.println("Meow");
			break;
		case RAT:
			System.out.println("Squeak!");
			break;
		}
	}
}

//if you could make enums, it would be its own file
//would read "public enum Animal" (eg)
//and the body would include DOG, CAT, RAT (eg)
//instead of making them static finals somewhere else. (like we did above)
//that makes them objects of the class

//other uses for enum:
//you can make constructors
//for example, the constructor can have a parameter
//that's needed each time an object is created (like name or ID or whatever)
//you can make methods too
