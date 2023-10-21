//Q. Count set bits in a number: (#google #amazom)
public class Q4_countSetBits {

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){   //check for LSB
                count++;
            }
            n = n>>1;   //right shifting the n
        }
        return count; 
    }
    public static void main(String[] args) {
        System.out.println("The number of set bits are: "+countSetBits(10));
    }
}

//NOTE: It requires log n base 2 + 1 bits to represent any number n