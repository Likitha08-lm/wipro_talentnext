
package arrays;
import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 34, 56, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();
        int index = -1; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i; 
            }
        }
        System.out.println(index);
	}


	}


