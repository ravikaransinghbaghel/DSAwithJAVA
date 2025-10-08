package Arrays.sorting;

import java.util.*; //  this package for all method and class 
// import java.util.Arrays; //for only arrays 

public class inbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = { 2, 37, 16, 34, 62, 31, 6, 43 };

        // int arr[] = { 2, 37, 16, 34, 62, 31, 6, 43 };
        
        // Arrays.sort(arr); //sort the array in increase order 
        // Arrays.sort(arr,0,3); //sort the array b/w index 0 to index 3 in increase order 
        Arrays.sort(arr,Collections.reverseOrder());//sort the array in discrement but work on object not predefine dataType like int char work on Integer,
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
