package arrays;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] arr = {12, 34, 12, 45, 67, 89};
		        int n = arr.length;
		        int[] temp = new int[n];
		        int newIndex = 0;
		        for (int i = 0; i < n; i++) {
		            boolean isDuplicate = false;
		            for (int j = 0; j < newIndex; j++) {
		                if (arr[i] == temp[j]) {
		                    isDuplicate = true;
		                    break;
		                }
		            }
		            if (!isDuplicate) {
		                temp[newIndex] = arr[i];
		                newIndex++;
		            }
		        }
		        System.out.print("Output: {");
		        for (int i = 0; i < newIndex; i++) {
		            System.out.print(temp[i]);
		            if (i < newIndex - 1) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("}");
			}

}
