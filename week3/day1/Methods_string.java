package week3.day1;

public class Methods_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating the string by literal
		String name = "Testleaf";
		String name1 = "TestLeaf";
		
		//creating the string by instantiation
		String str = new String("Testleaf");
		String str1 = new String("TestLeaf");
		
		//1) count the number of character
		int length = name.length();
		System.out.println(length);
		
		//2) compare the content of the string - this method compares the content of the string and it is case sensitive
		//equals method won't compare the memory location, it only compares the content of the string
		boolean equals = str.equals(name);
		System.out.println(equals);
		
		if (str.equals(str1)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		//== method - compares the memory location
		if (str==str1) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		//3) ignore case sensitive - doesn't check memory location, it checks for content
		boolean ingnorecase = str.equalsIgnoreCase(name1);
		System.out.println(ingnorecase);
		
		//4) to char array
		char[] charArray = name.toCharArray(); //shortcut to create this - type the right hand and give ctrl+2 and then L
		System.out.println(charArray);
			for (int i = 0; i < charArray.length; i++) {
				System.out.println(charArray[i]);
			}
			
		//5) CharAt - retrives particular character - index starts from 0
		char charAt = str.charAt(4);
		System.out.println(charAt);
		
		//6) replace - case sensitive
		String replace = name.replace("a", "@");
		System.out.println(replace);
		
		//7) retreive values - 
		String s = "Testleaf@321";
		String retrive = s.replaceAll("[^0-9]", "");
		System.out.println(retrive);
		String retrive1 = s.replaceAll("[^A-z]", ""); //retreives small and capital letter
		System.out.println(retrive1);
		String retrive2 = s.replaceAll("[^a-z]", ""); //retreives small letter
		System.out.println(retrive2);
		String retrive3 = s.replaceAll("[^0-9]", "*"); //alphabets will get the symbol and the number will be printed
		System.out.println(retrive3);
		
		//8) string to integer
		String st = "1234";
		int strtoint = Integer.parseInt(st);
		System.out.println(strtoint+10);
		
		//9) split - split the single string into multiple strings
		String s1 = "Testleaf and qeagle";
		String[] splt = s1.split("ea");
		System.out.println(splt[1]);
		//o/p is f and q - here "testl" - considered as 0 index, "f and q" - considered as 1 index, "gle" - considered as 2 index
		String[] splt1 = s1.split(" ");
		System.out.println(splt1[1]); 
		//o/p is and - here "testleaf" - considered as 0 index, "and" - considered as 1 index, "qeagle" - considered as 2 index
		
		//10) substring - crops the given string into multiple strings
		String s2 = "March";
		String ss = s2.substring(2);
		System.out.println(ss);
		String ss1 = s2.substring(1, 4);
		System.out.println(ss1);
	}

}
