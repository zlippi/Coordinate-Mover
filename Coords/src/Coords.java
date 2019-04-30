//Zachary Lippincott
//4/29/19

import java.util.ArrayList;

public class Coords {

	ArrayList<Double> numList;
	
	public Coords() {
		numList = new ArrayList<Double>();
	}
	
	
	//Accepts doubles that will be used as coordinates and put into a list
	public Coords(double... args) {
		numList = new ArrayList<Double>();
		for (int i = 0; i < args.length; i++) {
			numList.add(args[i]);
		}
	}
	
	
	
	//Will add coordinate to the list of coords
	public void addCoord(double coordinate) {
		numList.add(coordinate);
	}
	//Will add multiple coordinates to the list of coords
	public void addAllCoords(double... args) {
		for (int i = 0; i < args.length; i++) {
			numList.add(args[i]);
		}
	}
	
	//Will move both x and y cords
	public void moveCoords(double amount) {
		double carry;
		for (int i = 0; i < numList.size(); i++) {
			carry = numList.get(i) + amount;
			System.out.print(carry);
			if (i != numList.size() - 1) {
				System.out.print(", ");
			}
		}
	}
	
	//A positive argument will move the poly up,
	//A negative argument will move the poly down
	
	public void addY(double amount) {
		double carry;
		for (int i = 0; i < numList.size(); i++) {
			carry = numList.get(i) + amount;
			if (i % 2 != 0) {
				System.out.print(carry);
			}else {
				System.out.print(numList.get(i));
			}
			if (i != numList.size() - 1) {
				System.out.print(", ");
			}
		}
	}
	
	//A positive argument will move the poly to the right,
	//A negative argument will move the poly to the left
	
	public void addX(double amount) {
		double carry;
		for (int i = 0; i < numList.size(); i++) {
			carry = numList.get(i) + amount;
			if (i % 2 == 0) {
				System.out.print(carry);
			}else {
				
				System.out.print(numList.get(i));
			}
			if (i != numList.size() - 1) {
				System.out.print(", ");
			}
		}
	}
	
	public void getCenter() {
		double xCenter = 0;
		double yCenter = 0;
		for (int i = 0; i < numList.size(); i++) {
			if (i % 2 == 0) {
			xCenter += numList.get(i);
			}
			if (i % 2 != 0) {
				yCenter += numList.get(i);
			}
		}
		xCenter /= (numList.size() / 2);
		yCenter /= (numList.size() / 2);
		System.out.println("\n" + xCenter + ", " + yCenter);
		
	}
	
	//Not working yet.
	
	/*public void resize(double percent) {
		double amount = 0;
		for (int i = 0; i < numList.size(); i++) {
			amount = numList.get(i);
			amount += (amount * percent);
			System.out.print(amount);
			
			if (i != numList.size() - 1) {
				System.out.print(", ");
			}
		}
		
	}*/
	
	public void clear() {
		numList.clear();
	}
	
	
}
