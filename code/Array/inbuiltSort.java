/*
    In java the inbuilt sorting methods are provided by the Array class which we need to import in our file as follows:
    import java.util.Arrays;

    after importing the class we can use the sort(array) method to sort the array with tiem complexity = O(n logn) which is <<< Bubble, Insetion and Selection sort

 */

import java.util.Arrays;
import java.util.collections;

public class inbuiltSort {

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        //using inbuilt method to sort the array:
        Arrays.sort(arr);   //ascending order sorting
        System.out.println("The sorted array is: ");
        printArray(arr);

        //another interesting method to sort the given array with some special features is also provided by the Arrays class
        int anotherArr[] = {5, 4, 1, 3, 2};
        //now we want some of the elements to be sorted and rest of the elements being unsorted then it can be done as follows:
        Arrays.sort(anotherArr, 0, 3);      //(arr, starting index, ending index exclusive)
        printArray(anotherArr);             //output: 1 4 5 3 2 (1 4 5 being sorted and 3 2 are as it is)

        //now if we want to sort an array in descending order then we have to make the use of collections:
        Arrays.sort(anotherArr, collectons.reverseOrder());
        printArray(anotherArr);
        
    }
}