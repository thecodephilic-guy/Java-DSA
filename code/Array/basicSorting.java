/*
    * Three basic sorting techniques:
    * 1. Bubble Sort
    * 2. Selection Sort
    * 3. Insertion Sort
*/

class sort{

    //1. Bubble Sort:
    public void bubbleSort(int arr[]){
        int len = arr.length;
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //2. Selection Sort:
    //first of all we have to consider that first element of the arr is the smallest
    public void selectionSort(int arr2[]){
        for(int i=0; i<arr2.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr2.length; j++){
                if(arr2[smallest]>arr2[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr2[smallest];
            arr2[smallest] = arr2[i];
            arr2[i] = temp;
        }
    }

    //3. Insersion sort:
    /*
        *  Remember this line: "Insert an element from unsorted arr to its correct position in sorted arr."
    */

    public void insertionSort(int arr[]){
        //logic:
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int pre=i-1;

            //finding out the correct pos to insert
            while(pre>=0 && current < arr[pre]){
                arr[pre+1] = arr[pre];
                pre--;
            }
            //placement:
            arr[pre+1] = current;
        }
    }

    //printing the array:
    public void printArr(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class basicSorting{

    
       
    public static void main(String[] args) {
        
        int arr[] = {7, 8, 3, 1, 2};

        // A new arr for another sorting method:
        int arr2[] = {7, 8, 3, 1, 2};

        //let's define a new arr:
        int arr3[] = {7, 8, 3, 1, 2};

        sort sortingObject = new sort();
    
        System.out.print("Current array: ");
        sortingObject.printArr(arr);
        sortingObject.bubbleSort(arr);
        System.out.print("Result of Bubble Sort: ");
        sortingObject.printArr(arr);

        System.out.print("Current array: ");
        sortingObject.printArr(arr2);
        sortingObject.selectionSort(arr2);
        System.out.print("Result of Selection Sort: ");
        sortingObject.printArr(arr);

        System.out.print("Current array: ");
        sortingObject.printArr(arr3);
        sortingObject.insertionSort(arr3);
        System.out.print("Result of Insertion Sort: ");
        sortingObject.printArr(arr3);
    }
}

        // Note: Time Complexity of all three techniques is Big O of n square.