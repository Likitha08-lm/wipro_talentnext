package oops_fundamentals;

//public class Question4 {
	class Animal{
		public void eat() {
			System.out.println();
		}
		public void sleep() {
			System.out.println();
		}
	}
	class Bird extends Animal{
		public void eat() {
			System.out.println();
		}
		public void sleep() {
			System.out.println();
		}
		public void fly() {
			System.out.println();
		}
	//}
public class Question4{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		Bird bird=new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}
}
}

