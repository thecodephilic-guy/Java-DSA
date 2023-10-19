/*
    Determine if 2 strings are anagrams of each other.
    What are anagrams?
    If two strings contain the same characters but in a different order, they can be said to be 
    anagrams. Consider "race" and "care", race's characters can be formed into care, 
    or care's characters can be formed into race.
 */

public class anagramStrings{

    public static boolean checkAnagrams(String str1, String str2){
        char str1Array[] = str1.toCharArray();
        char str2Array[] = str2.toCharArray();
        int len = 0;

        //outer loop for str1:
        for (int i = 0; i < str1Array.length; i++) {
            //inner loop for str2:
            for (int j = 0; j < str2Array.length; j++) {
                if(str1Array[i] == str2Array[j]){
                    len++;
                }
            }
        }
        if(len == str1Array.length){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "low";
        String str2 = "owl";
        System.out.println(checkAnagrams(str1, str2));
    }
}