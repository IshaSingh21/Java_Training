package inheritance_Polymorphism;


class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c=new Cat();  
		c.meow();  
		c.eat();  
	}

}
