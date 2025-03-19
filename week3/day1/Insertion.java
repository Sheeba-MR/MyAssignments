package week3.day1;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = new int[100];
	    array[0] = 2;
	    array[1] = 4;
	    array[2] = 6;
	    array[3] = 8;
	    array[4] = 10;
        int size = 5; 

        int newPosition = 2; 
        int newElement = 7; 

        
        for (int i = size - 1; i >= newPosition; i--) {
            array[i + 1] = array[i];
        }

        
        array[newPosition] = newElement;

        size++; 

        
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

	}

}
