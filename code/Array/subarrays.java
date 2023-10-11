/*
        Q. Print all subarrays and find the number of subarrays, also find the maximum and minimun value of the sum of elements of the subarrays
        
        desired output:

        [ 2 ] [ 2  4 ] [ 2  4  6 ] [ 2  4  6  8 ] [ 2  4  6  8  10 ] 
        [ 4 ] [ 4  6 ] [ 4  6  8 ] [ 4  6  8  10 ] 
        [ 6 ] [ 6  8 ] [ 6  8  10 ] 
        [ 8 ] [ 8  10 ] 
        [ 10 ] 
        Total Subarrays: 15
        The Max value of sum is: 30
        The Min value of sum is: 2
 */


public class subarrays{

    public static void printSubarrays(int data[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        //outer loop:
        for(int i=0; i<data.length; i++){
            int start = i;
            //inner loop:
            for(int j=i; j<data.length; j++){
                int end = j;
                //loop for printing:
                System.out.print("[");
                for(int k=start; k<=end; k++){
                    System.out.print(" "+data[k]+" ");
                    sum = sum + data[k];
                }
                System.out.print("] ");
                if(maxSum < sum){
                    maxSum = sum;
                }
                if(minSum > sum){
                    minSum = sum;
                }
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
        System.out.println("The Max value of sum is: "+maxSum);
        System.out.println("The Min value of sum is: "+minSum);
        return;
    }

    public static void main(String[] args) {
        int data[] = {2, 4, 6, 8, 10};
        printSubarrays(data);
    }
}