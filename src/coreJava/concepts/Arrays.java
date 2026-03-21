package coreJava.concepts;
public class Arrays {
	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5 };
		System.out.println(n.length);

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 9;
		arr[4] = 7;
		for (int m = 0; m < arr.length; m++) {
			System.out.println(arr[m] + " ");
		}
		int[][] arr2 = {

				{ 1, 2, 4, 5 }, { 1, 3 }, { 3, 4, 5, 6, 8 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
		
			System.out.println();
		}
	}
}
