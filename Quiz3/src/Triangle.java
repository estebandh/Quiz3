
public class Triangle{
	private double side1=1;
	private double side2=1;
	private double side3=1;
	
	public  Triangle(){	
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	/**
	 * 
	 * @return the area of the triangle
	 */
	public double getArea(){
		double s;
		s = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	/**
	 * 
	 * @return a description of the triangle
	 */
	public String toString(){
		return "Triangle with side lengths "+side1+", "+side2+", "+side3+" and a perimeter of "+getPerimeter()+" units and an area of "+getArea()+" units.";
	}
	/**
	 * 
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter(){
		return side1+side2+side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
}
