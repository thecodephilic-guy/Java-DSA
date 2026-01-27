public class bitManipulation {
    public static void main(String[] args) {

        //Binary AND &
        System.out.println(5 & 6);  //output: 4 

        //Binary OR |
        System.out.println(5 | 6);  //output: 7

        //Binary XOR ^
        System.out.println(5 ^ 6);  //output: 3

        //Binary One's compliment ~ (NOT)
        System.out.println(~5);     //output: -6
        System.out.println(~0);     //output: -1

        /*
         *      Let's have a look on the theory of NOT:
         *      things to remember:
         *      1. LSB = Least Significant Bit (right most bit of a binary number)
         *      2. MSB = Most Significant Bit  (left most bit of a binary number)
         *      3. Whenever there is a change in the MSB (from 0 to 1 or from 1 to 0) the sign of the decimal number while conversion is also affected:
         *          if(MSB == 0) -> number is +ve
         *          if(MSB == 1) -> number is -ve
         * 
         * Now, as 5 = 0101 in Binary, but in computer system it is not represented the 4 bits only rater it is represented by a lot of 0s and 1s lets say:
         *  5 = 00000101
         * Then ~5 = 11111010    (Notice MSB got changed from 0 to 1 this means number becomes -ve)
         * Now we need to identify the magnitude of that -ve number, here's how this is done:
         * Step 1. Find the 1's complement of 11111010:
         *       ~11111010 = 00000101
         * Step 2. Find the 2's complement by adding 1 to it:
         *      00000101 + 1 = 00000110 (now this is equivalent to 6)
         * 
         * Therefore the output is -6
         */

        //Binary Left Shift <<
        System.out.println(5 << 2); //output: 20

        /*
         * What it does?
         * It left shifts the binary number by two places:
         *          Example: 5 = 00000101
         *                   then 5 after two shifts : 00010100 == 20 (gaps created after left shift are filled by 0s)
         * 
         * Direct formula for calculations: a << b = a * 2 raised to the power b
         */

        //Binary Right Shift >>
        System.out.println(5 >> 2); //output: 1
        //Direct formula for calculations: a >> b = a / 2 raised to the power b
        System.out.println();
        System.out.println();

        Solution sol = new Solution();
        System.out.println("Bruteforce check for ith Bit: "+ sol.checkIthBit(5, 0));
        System.out.println("Optimized check for ith Bit: "+ sol.checkIthBit2(5, 1));
        System.out.println("Is 3 odd? : "+ sol.isOdd(3));
        System.out.println("Is 4 odd? : "+ sol.isOdd(4));
    }
}

class Solution {

    //the bruteforce approach: O(log n)
    public boolean checkIthBit(int n, int i){
        String binary = Integer.toBinaryString(n);

        if(i >= binary.length()) return false;

        return binary.charAt(binary.length()-1-i) == '1';
    }

    //the optimized approach: O(1)
    public boolean checkIthBit2(int n, int i){
        int mask = 1 << i;

        return (n & mask) != 0;
    }

    //TC - O(1)
    public boolean isOdd(int num){
        //using the fact binary representation of all the odd numbers has 1 as LSB:
        //so we can use 1 as mask
        //XOR of a number with 1 increase the number by 1 if it is even and decrease the number by 1 if
        //the number is odd
        int newNum = num ^ 1;
        return newNum == num-1;

        //return num^1 == num-1;  (one line code)
    }
    
}
