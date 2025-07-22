package oops_fundamentals;


	class shape{
		public void draw() {
			System.out.println("Drawing shape");
		}
		public void erase() {
			System.out.println("Erasing shape");
		}
	}
	class Circle extends shape{
		public void draw() {
			System.out.println("Drawing circle");
		}
		public void erase() {
			System.out.println("Erasing circle");
		}
	}
	class Triangle extends shape{
		public void draw() {
			System.out.println("Drawing Traingle");
		}
		public void erase() {
			System.out.println("Erasing Triangle");
		}
	}
	class Square extends shape{
		public void draw() {
			System.out.println("Drawing Square");
		}
		public void erase() {
			System.out.println("Drawing square");
		}
	}
	public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new Square();
		shape c=new Circle();
		shape t=new Triangle();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		

	}

}

