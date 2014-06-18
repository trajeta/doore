package net.bit.company;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		this(1.0, "red");
//		radius = r;
//		color = c;
	}
	public Circle(double r){
		this(r,"red");
//		radius = r;
//		color = c;
	}
	public Circle(double r,String c){
		radius = r;
		color = c;
		
	}
	
	
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public static void main(String[] args) {
		
		Circle c1 = new Circle(2.0,"blue");
		System.out.println("Radius us "+ c1.getRadius()
				+" Color is "+c1.getColor()+"Area is "+c1.getArea());
		
		Circle c2 = new Circle(2.0);
		System.out.println("Radius us "+ c2.getRadius()
				+ " Color is "+c2.getColor()+"Area is "+c2.getArea());
		
		Circle c3 = new Circle();
		System.out.println("Radius us " + c3.getRadius()
			+ " Color is "+ c3.getColor() + "Area is " + c3.getArea());
		
	}
}
