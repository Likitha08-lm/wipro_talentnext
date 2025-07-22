package oops_fundamentals;


	class Fruit{
		String name;
		String taste;
		String size;
		public Fruit(String name, String taste, String size) {
			this.name=name;
			this.taste=taste;
			this.size=size;
		}
		public void eat() {
			System.out.println("The "+ name +" is "+ taste);
		}
	}
	class Apple extends Fruit{
	      String color;
		public  Apple(String name, String taste, String size) {
			super(name,taste,size);
			//this.color=color;
		}
			public void eat() {
		        System.out.println("The " + name + " is " + taste + " and is of " + color + " color.");
		    }
	}
	class Orange extends Fruit{
		public Orange(String name,String taste, String size) {
			super(name,taste,size);
		}
		public void eat() {
			System.out.println("Orange is sweet");
		}
	}
	public class Question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit obj1=new Fruit("Pear", "sweet", "medium");
		Apple obj2=new Apple("Apple", "sweet", "medium");
		Orange obj3=new Orange("Orange", "sour", "medium");
		obj1.eat();
		obj2.eat();
		obj3.eat();
		
		
		

	}

}

