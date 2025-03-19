package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		// compare the length of the strings
		int a = text1.length();
		int b = text2.length();
		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		//to char arrays
		char[] charArray1 = text1.toCharArray(); //shortcut to create this - type the right hand and give ctrl+2 and then L
		System.out.println(charArray1);
			for (int i = 0; i < charArray1.length; i++) {
				System.out.println(charArray1[i]);
				
				
				
			}
			
		char[] charArray2 = text2.toCharArray(); //shortcut to create this - type the right hand and give ctrl+2 and then L
		System.out.println(charArray2);
				for (int i = 0; i < charArray2.length; i++) {
					System.out.println(charArray2[i]);
				}
				
		// sort character arrays
		Arrays.sort(charArray1);
		System.out.println(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray2);
		
	}
	
}
