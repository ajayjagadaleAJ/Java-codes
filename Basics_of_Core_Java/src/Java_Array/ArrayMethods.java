package Java_Array;
import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 5, 2, 4, 9};
		
		//Array to Tostring
		System.out.println("Array: " + Arrays.toString(arr));
		
        
        //Sort the arrray
        Arrays.sort(arr); 
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        //Serch array in given array
        int index = Arrays.binarySearch(arr, 9);
        System.out.println("Element found at index: " + index);
        
        //Copy array
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));
        
        //Copy subset of array
        int[] subArray = Arrays.copyOfRange(arr, 2, 5);
        System.out.println("Subset Array: " + Arrays.toString(subArray));
        
        //filling array with values
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 7);
        System.out.println("Filled Array: " + Arrays.toString(arr1));
        
        //Compare two arrays
        System.out.println("arr == arr1: " + Arrays.equals(arr, arr1)); 
        
        //Converting to arrayList
        String[] arr2 = {"Apple", "Banana", "Cherry"};
        List<String> list = Arrays.asList(arr2);
        System.out.println("List: " + list);
        
        
        //Printing multidimentional arrays
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("2D Array: " + Arrays.deepToString(matrix));
        
        
	}
	
	
	
}
