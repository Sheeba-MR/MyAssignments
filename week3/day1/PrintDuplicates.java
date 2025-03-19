package week3.day1;

public class PrintDuplicates {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,7,8,2,9,3};
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j=i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicates are: "+a[i]);
				}
				
			}
	}

}
}