package arrays;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[][] array = new int[3][3];
        int index = 0;
        int max = Integer.MIN_VALUE;

        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[index]);
                System.out.print(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                index++;
            }
            System.out.println(); 
        }
        System.out.println(max);
	}

}
