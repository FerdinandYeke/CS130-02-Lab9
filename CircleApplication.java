
public class CircleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircleEncp3  Circle1 = new CircleEncp3(10);
		
		System.out.println("The Area of the circle is: "+Circle1.getAreaCircle());
		System.out.println("The Perimeter of the circle is: "+Circle1.getPeriCircle());
		
		//new value
		Circle1.setRadius(25);
		System.out.println("The Area of the circle is: "+Circle1.getAreaCircle());
		System.out.println("The Perimeter of the circle is: "+Circle1.getPeriCircle());
				
	}

}
