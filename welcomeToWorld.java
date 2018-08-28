package FirstProgram;

public class welcomeToWorld {

	public static void main(String[] args) {


		System.out.println("Welcome to your first Java Program.");
		
		Box box1  = new Box();
		Box box2 = new Box(4);
		Box box3 = new Box(4,5,6);
		
		System.out.println("Box1 volume " + box1.computeVolume());
		System.out.println("Box2 volume " + box2.computeVolume());
		System.out.println("Box3 volume " + box3.computeVolume());
	}




}