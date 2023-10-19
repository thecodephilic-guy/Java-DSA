//Program to implement binary search
//prerequisite - sorted array

public class binarySearch{

    public static int binSearch(int array[], int key){
        int start = 0;
        int end = array.length-1;

        while (start<=end) {
            int mid = start + ((end-start))/2;

            if(array[mid]==key){
                return mid;
            }
            if(array[mid]>key){
                end = mid-1;
            }
            if(array[mid]<key){
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12, 14}; //array should be sorted
        int key = 1;

        int index = binSearch(array, key);
        if(index == -1){
            System.out.println("Number is not present in the array");
        }
        else{
            System.out.println("The number is present at index: "+index);
        }
    }
}

// Time Complexity = log(n)