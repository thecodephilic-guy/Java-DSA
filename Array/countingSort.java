/*
        where to use counting sort?
        In scenarios where the numbes are not much larger for example: marks of the students (usually between 1 to 100)
        indirectly what I mean is the range of numbers is very short. (not much diff b/w maxEle and minEle)

        this algo can be very much efficient in some cases that it may even provide linear time complexity i.e n

        NOTE: Counting sort is basically designed for +ve numbers only.
 */


public class countingSort {

    public static void countSort(int arr[]){

        //findig the largest element to define the length of the count array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        //defining the count array:
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting: 
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    //method for printing the array:
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};       //minEle = 1 and maxEle = 7 (a total range of 7 numbers)
        countSort(arr);
        System.out.print("The sorted array is: ");
        printArray(arr);
    }
}