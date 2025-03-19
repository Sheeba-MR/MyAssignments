package week3.day1;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121;
		int r = 0;
		int temp = input;
		int sum = temp;
		
		while (input>0){    
			   r=input%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   input=input/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");  
		
		
	}

}
