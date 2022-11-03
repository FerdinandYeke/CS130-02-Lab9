
public class CylinderClass {

	private double radius;
	private double height;
	
	public CylinderClass(double radius, double height) 
	{
		this.radius = radius;
		this.height = height;
	}
	
	//Getters
	
	public double getAreaCylinder() 
	{
		double Area = 2 * Math.PI * radius *(radius + height);
		return Area;
	}
	
	public double getVolumeCylinder()
	{
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	//Getter ends here
	
	//Setter
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public void setHeight(double height) 
	{
		this.height = height;
	}
}
