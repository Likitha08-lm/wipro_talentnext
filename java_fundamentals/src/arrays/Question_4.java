package arrays;
import java.util.*;

public class Question_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
	}


}