/*
    Let's understand what is Kadane's Method:
    It is a method to find the maximum sum of subarray elements with the best case time complexity. 
    It states that iterate each and every element of the array once and keep on finding the currSum (Current Sum) and maxSum (Maximum Sum).
    We keep on adding the sum of array elements into the currSum until it becomes -ve and once it becomes -ve we change the currSum value to 0 (zero). 
    and if currSum becomes +ve then assign that +ve value to currSum and update the maxSum accordingly.
    Keep on doing so and at the end you'll be left with the maxSum as the answer.

    NOTE: We have to consider maxSum as 0 if all the elements of the array are -ve.
 */


public class kadanesMethod{

    //logic to find the maximum subarray sum:
    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum subarray sum is: "+maxSum);
    }


    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}

//Time Complexity = Big O of n (which is far better than previous two methods)