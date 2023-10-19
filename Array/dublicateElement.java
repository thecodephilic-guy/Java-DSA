public class dublicateElement {

    //Approach 1 (Time Complexiety = big O of n square)
    public static boolean checkDuplicate(int nums[]){
        for(int i = 0; i<nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Approach 2 (Time Complexiety = O(n))
    public static boolean checkDup(int nums[]){
       return true;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(checkDuplicate(nums)); 
        System.out.println(checkDup(nums));
    }
}