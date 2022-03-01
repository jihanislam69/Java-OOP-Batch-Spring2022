
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Array1D {

	public static void main(String[] args) {

		int num[] = { 7, 4, 5, 6, 2, 9, 20, 11, 10 };
		double cgpa[] = { 3.6, 3.8, 4.0, 3.9 };
		String name[] = { "Maisa", "Israk", "Jannat", "Lizam" };
		Scanner sc = new Scanner(System.in);
		/*
		 * int size; System.out.println("Enter The Array size : "); size=sc.nextInt();
		 * int num[]=new int[size]; for(int count=0;count<num.length;count++) {
		 * System.out.println("Enter The Index "+(count+1)+" Value :");
		 * num[count]=sc.nextInt(); }
		 */
		/*
		 * int sum=0,track=0; for(int count=0;count<num.length;count++) {
		 * if(num[count]%2==0) { sum+=num[count]; track++; } } double avg;
		 * avg=(double)sum/track; System.out.println(avg);
		 */
		// Arrays.sort(num,Collections.reverseOrder());
		/*for (int count = 0; count < num.length; count++) {

			for (int count1 = count+1; count1 < num.length; count1++) {

				int temp=0;
				if(num[count]>num[count1]) {
					temp=num[count];
					num[count]=num[count1];
					num[count1]=temp;
				}
					
			}
		}
		
*/
/*		int min=num[0];
		for (int count = 0; count < num.length; count++) {

			if(num[count]<min) {
				min=num[count];
			}
		}
		System.out.println(min);*/
		//take 10 input from user,Name,Id,cgpa,mark; who got max score print that name; 

	}

}
