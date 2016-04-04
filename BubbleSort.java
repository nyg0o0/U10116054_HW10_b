import java.util.*;
 
public class BubbleSort{
    public static void main(String[] args) {
		
			/* prompt the user to add a array */
			Scanner input = new Scanner(System.in);	// new object for scanner
			
			System.out.print("How many numbers for sorting? "); 	// prompt user to input how many numbers for sorting
			int numbers = input.nextInt();	// read the input
			int[] arr = new int[numbers];	// creat a array for specified length
			
			for(int i=0; i<numbers;i++){	// store the input data into the array
				System.out.printf("Elements %d of the array: ",i); 
				arr[i] = input.nextInt();
			}
			
			
			System.out.println("---------------------------------");	// divider line
			
			
			/* show the array before sorting */
			System.out.print("The array before sorting: ");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " "); 
			}
			
			/* sort the array */
			int bubble,temp;
			for(int i = arr.length ; i >= 2 ; i--){
				for(int j = 0; j < i-1 ; j++){
					if(arr[j] > arr[j+1]){
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			System.out.println(); 
	 
			/* show the array after sorting */
			System.out.print("The array after sorting: "); 
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
		}
} 