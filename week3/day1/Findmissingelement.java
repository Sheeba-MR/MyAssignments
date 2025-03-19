package week3.day1;

import java.util.Arrays;

public class Findmissingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,9,2,5,1,6,4};
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++)
		{
			int a = i+1;
			
			if((i+1)!=array[i])
			{
				System.out.println("Missing numbers are:" + a);
				break;
			}
	}
	}

}
