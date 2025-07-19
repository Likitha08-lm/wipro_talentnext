package abstraction;

public class Question4 {
	interface Test{
		int myFunction(int a, int b, int c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        int result1 = t1.myFunction(2, 3, 4); // 2 + 3 + 4 = 9
        int result2 = t2.myFunction(2, 3, 4); // 2 * 3 * 4 = 24
        System.out.println(result1);
        System.out.println(result2);

	}

}
