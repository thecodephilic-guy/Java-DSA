//Q. Check if a number is Odd or Even

/*
 * Logic: 
 *  The LSB of all the binary equivalents of decimals is 1 for odd numbers.
 *  And LSB of all the binary equivalents of decimals is 0 for even numbers.
 * 
 * Now all we need is a method to check the LSB of a number. 
 * We can make the use of Bitwise AND &. Let's see how:
 */

public class Q1_evenOdd {

    public static void oddEven(int number){
        int bitMask = 1;
        if((number & bitMask) == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
    public static void main(String[] args) {

        oddEven(2);
        oddEven(11);
        oddEven(3);
    }
}
