public class dublicateElement {

    public static boolean checkDuplicate(int nums[]){
        boolean state = false;
        for(int i = 0; i<nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    state = true;
                    return state;
                }
            }
        }
        return state;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checkDuplicate(nums)); 
    }
}