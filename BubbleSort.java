import java.util.*;
 
public class BubbleSort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        //int[] arr = {93, 5, 3, 55, 57, 7, 2 ,73, 41, 91};
		System.out.print("How many numbers for sorting? "); 
		int numbers = input.nextInt();
		
		int[] arr = new int[numbers];
		for(int i=0; i<numbers;i++){
			System.out.printf("Elements %d of the array: ",i); 
			arr[i] = input.nextInt();
		}
		
		System.out.println("---------------------------------");

    }
} 