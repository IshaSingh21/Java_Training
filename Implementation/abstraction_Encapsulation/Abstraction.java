package abstraction_Encapsulation;

abstract class Shape {
	abstract void draw();
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s=new Circle();
		Shape s1=new Rectangle();
		s.draw();
		s1.draw();
	}

}
