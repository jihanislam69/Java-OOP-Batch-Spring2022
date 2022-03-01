import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1[][] = { { 2, 4, 6 }, { 8, 5, 2 }, { 9, 3, 1 } };
		/*
		 * int num2[][]= {{2,4,6} ,{8,5,2}, {9,3,1}};
		 */
		/*
		 * int num[][]=new int[3][3]; for(int row=0;row<3;row++) { for(int
		 * col=0;col<3;col++) { num[row][col]=sc.nextInt(); }
		 * 
		 * }
		 */ /*
			 * for(int row=0;row<3;row++) { for(int col=0;col<3;col++) {
			 * System.out.print(num[row][col]+" "); } System.out.println(); }
			 */
		/*
		 * int colsum=0; for(int row=0;row<3;row++) { colsum=0; for(int
		 * col=0;col<3;col++) { colsum+=num[col][row]; }
		 * System.out.println("Sum of row"+(row+1)+" :"+ colsum); }
		 */
		/*
		 * int sum=0; for(int row=0;row<3;row++) { for(int col=0;col<3;col++) {
		 * sum+=num1[row][col]+num2[row][col]; }
		 * 
		 * } System.out.println("Sum of  Array :"+ sum);
		 * 
		 */
		int min = num1[0][0];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (num1[row][col] > min) {
					min = num1[row][col];
				}
			}
		}
		System.out.println(min);

	}

}
