package week3.day1;

public class OddindexUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		char[] chrArray = test.toCharArray();
		System.out.println(chrArray);
		for (int i = 0; i < chrArray.length; i++) {
			System.out.println(chrArray[i]);
		}
		for (int i = 0; i < chrArray.length; i++) {
			if (i %2 != 0) {
				chrArray[i] = Character.toLowerCase(chrArray[i]);
				
			} 
			
		String newString = new String();
		System.out.println(newString);
		}

	}

}
