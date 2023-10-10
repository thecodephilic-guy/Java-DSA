public class largestNumber{

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;    //the variable largest will store the max possible nagative value in it
        
        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int num[]){
        int smallest = Integer.MAX_VALUE;    //the variable largest will store the max possible positive value in it
        
        for(int i=0; i<num.length; i++){
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 6, 5};

        System.out.println("The largest number in the array is: "+getLargest(num));
        System.out.println("The Smallest number in the array is: "+getSmallest(num));
    }
}