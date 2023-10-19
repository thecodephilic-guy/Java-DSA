//A better approach to find the max sum of the subarray elements:

public class prefixSumMethod{

    public static void maxSubarraySum(int data[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixArray[] = new int[data.length];

        //calculation of prefix array:
        prefixArray[0] = data[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = data[i] + prefixArray[i-1];
        }


        //outer loop:
        for(int i=0; i<data.length; i++){
            int start = i;
            //inner loop:
            for(int j=i; j<data.length; j++){
                int end = j;
                currSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The Max value of sum is: "+maxSum);
        return;
    }

    public static void main(String[] args) {
        int data[] = {1, -2, 6, -1, 3};
        maxSubarraySum(data);
    }
}

//New Time Complexity = Big O of n square (but there's yet another better way called KADANE'S algorithm)