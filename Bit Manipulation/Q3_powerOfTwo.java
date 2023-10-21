// Q. Check if a number is a Power of 2 or not.

import java.util.Scanner;

public class Q3_powerOfTwo {

    /*
     * Observe that a number which is a power of 2 & a number less than that = 0 (This is property)
     * 4 & 3 = 0 i.e 100 & 011 = 0
     * 8 & 7 = 0 i.e 1000 & 0111 = 0
     */

    public static boolean isPowerOfTwo(int n){
    //     if((n & (n-1)) == 0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

        //The above code can alos be written in one line:
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a power of 2: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPowerOfTwo(n));
        
    }
}
