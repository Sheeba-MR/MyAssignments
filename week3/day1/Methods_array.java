package week3.day1;

import java.util.Arrays;

public class Methods_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating array by array literal
		int [] marks = {87,91,92,98,78}; // index starts with 0
		
		//creating array by instantiation
		int marks1[] = new int [4];
		marks1 [0] = 65;
		marks1 [1] = 78;
		System.out.println(marks1[1]);
		
		//1) length of an array
		int len = marks.length; //length starts form 1
		System.out.println(len);
		
		//interate all values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//2) sort an array
		Arrays.sort(marks); //78,87,91,92,98
		System.out.println("After sorting: "+marks[1]);
		
		//3) maximum value in the array or the largest number in the array
		System.out.println(marks[len-1]); //marks is sorted already in the previous method
		
		//4) find intersection - common values
		int num[]= {3,4,6,5,8};
		int num1[]= {4,5,1,6,7};
		
		//nested loop to find intersection
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Intersection is: "+num[j]);
				}
			}
		}
		
		
 
	}

}
