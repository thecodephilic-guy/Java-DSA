public class bitManipulation {
    public static void main(String[] args) {

        // Binary AND &
        System.out.println(5 & 6); // output: 4

        // Binary OR |
        System.out.println(5 | 6); // output: 7

        // Binary XOR ^
        System.out.println(5 ^ 6); // output: 3

        // Binary One's compliment ~ (NOT)
        System.out.println(~5); // output: -6
        System.out.println(~0); // output: -1

        /*
         * Let's have a look on the theory of NOT:
         * things to remember:
         * 1. LSB = Least Significant Bit (right most bit of a binary number)
         * 2. MSB = Most Significant Bit (left most bit of a binary number)
         * 3. Whenever there is a change in the MSB (from 0 to 1 or from 1 to 0) the
         * sign of the decimal number while conversion is also affected:
         * if(MSB == 0) -> number is +ve
         * if(MSB == 1) -> number is -ve
         * 
         * Now, as 5 = 0101 in Binary, but in computer system it is not represented the
         * 4 bits only rater it is represented by a lot of 0s and 1s lets say:
         * 5 = 00000101
         * Then ~5 = 11111010 (Notice MSB got changed from 0 to 1 this means number
         * becomes -ve)
         * Now we need to identify the magnitude of that -ve number, here's how this is
         * done:
         * Step 1. Find the 1's complement of 11111010:
         * ~11111010 = 00000101
         * Step 2. Find the 2's complement by adding 1 to it:
         * 00000101 + 1 = 00000110 (now this is equivalent to 6)
         * 
         * Therefore the output is -6
         */

        // Binary Left Shift <<
        System.out.println(5 << 2); // output: 20

        /*
         * What it does?
         * It left shifts the binary number by two places:
         * Example: 5 = 00000101
         * then 5 after two shifts : 00010100 == 20 (gaps created after left shift are
         * filled by 0s)
         * 
         * Direct formula for calculations: a << b = a * 2 raised to the power b
         */

        // Binary Right Shift >>
        System.out.println(5 >> 2); // output: 1
        // Direct formula for calculations: a >> b = a / 2 raised to the power b
        System.out.println();
        System.out.println();

        Solution sol = new Solution();
        System.out.println("Bruteforce check for ith Bit: " + sol.checkIthBit(5, 0));
        System.out.println("Optimized check for ith Bit: " + sol.checkIthBit2(5, 1));
        System.out.println("Is 3 odd? : " + sol.isOdd(3));
        System.out.println("Is 4 odd? : " + sol.isOdd(4));
        System.out.println("Total set bits in 15 = " + sol.countSetBits(15)); // 1111
        System.out.println("Total set bits in 16 = " + sol.countSetBits(16)); // 10000
        System.out.println("Total set bits in 15 = " + sol.countSetBits2(15)); // 1111
        System.out.println("Total set bits in 16 = " + sol.countSetBits2(16)); // 10000
        System.out.println("Setting rightmost bit of 16 = " + sol.setRightmostUnsetBit(16)); // output - 17
        System.out.println("Setting rightmost bit of 17 = " + sol.setRightmostUnsetBit2(17)); // output - 19
        int[] nums = {15, 16};
        sol.swapXOR(nums);
        System.out.println("Array [15 16] after swapping: ");
        printArray(nums);
    }
    public static void printArray(int[] nums){
        System.out.print("[ ");
        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println("]");
    }
}

class Solution {

    // the bruteforce approach: O(log n)
    public boolean checkIthBit(int n, int i) {
        String binary = Integer.toBinaryString(n);

        if (i >= binary.length())
            return false;

        return binary.charAt(binary.length() - 1 - i) == '1';
    }

    // the optimized approach: O(1)
    public boolean checkIthBit2(int n, int i) {
        int mask = 1 << i;

        return (n & mask) != 0;
    }

    // TC - O(1)
    public boolean isOdd(int num) {
        // using the fact binary representation of all the odd numbers has 1 as LSB:
        // so we can use 1 as mask
        // XOR of a number with 1 increase the number by 1 if it is even and decrease
        // the number by 1 if
        // the number is odd
        int newNum = num ^ 1;
        return newNum == num - 1;

        // return num^1 == num-1; (one line code)
    }

    // Brute Force 1 - O(n) n is length of binary string.
    public int countSetBits(int n) {
        String binary = Integer.toBinaryString(n);

        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1')
                count++;
        }

        return count;
    }

    // Optimized- O(k) k is number of set bits
    public int countSetBits2(int n) {
        int count = 0;

        while (n > 0) {
            count += (n & 1); // Check if the least significant bit is set (1)
            n >>= 1; // Right shift n by 1 to process the next bit
        }

        return count;
    }

    // Bruteforce - O(log n)
    public int setRightmostUnsetBit(int n) {
        // 1. Convert to binary string
        String binaryString = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binaryString);

        // 2. Find the last (rightmost) '0'
        int lastUnsetBitIndex = sb.lastIndexOf("0");

        // 3. Logic: If a '0' exists, change it to '1'
        if (lastUnsetBitIndex != -1) {
            sb.setCharAt(lastUnsetBitIndex, '1');
        } else {
            // If no '0' exists (like "111"), the rightmost unset bit
            // is technically the one just to the left of the string
            return Integer.parseInt("1" + binaryString, 2);
        }

        // 4. Parse back to int using radix 2
        return Integer.parseInt(sb.toString(), 2);
    }

    // Optimized - O(1)
    public int setRightmostUnsetBit2(int n) {
        // result = n | (n + 1)
        // n + 1 flips the rightmost 0 in n to 1, and all bits to the right become 0.
        // Performing OR sets that bit to 1 while leaving other bits unchange

        return n | (n+1);
    }

    public void swapXOR(int[] nums){ // [15, 16]
        nums[0] = nums[0] ^ nums[1]; //11111
        nums[1] = nums[0] ^ nums[1]; //01111 (16) flipped
        nums[0] = nums[0] ^ nums[1]; //10000 (15) flipped
    }
}
