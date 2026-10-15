package oops;

class animal{
	 String color;
	 public void eat() {
		 System.out.println("animal is eating");
	 }
	 
}
class dog extends animal{
	String breed ="pug";
	
	public void bark() {
		System.out.println("dog is barking ");
	}
}
class cat extends animal{
	int age =2;
	public void sound() {
		System.out.println("meoww..");
	}
}


public class inheritanceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c =new cat();
		System.out.println("cat colour:"+(c.color ="grey"));
		System.out.println("cat age :"+(c.age));
		c.sound();
		c.eat();
		
		dog d =new dog();
		System.out.println("dog colour:"+(c.color ="black"));
		System.out.println("dog breed  :"+(c.breed));
		c.bark();
		c.eat();

	}

}
