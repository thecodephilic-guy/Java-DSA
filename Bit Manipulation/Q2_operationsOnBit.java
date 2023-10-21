class operations{

    //Operation - 1: Get ith bit:
    public void getBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            System.out.println("The "+i+"th bit is 0");
        }
        else{
            System.out.println("The "+i+"th bit is 1");
        }
    }

    //Operation - 2: Set ith bit:
    public int setBit(int n, int i){
        int bitMask = 1<<i;
        System.out.print(n+" after setting the "+i+"th bit is: ");
        return (n | bitMask);
    }

    //Operation - 3: Clear ith bit:
    public int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        System.out.print(n+" after clearing the "+i+"th bit is: ");
        return (n & bitMask);
    }

    //Operation - 4: update ith bit:
    public int updateBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearBit(n, i);
        }
        else{
            return setBit(n, i);
        }

        /*
         * another logic:
         * n = clearBit(n, i);
         * int bitMask = newBit << i;
         * return (n | bitMask);
         */
    }

    //Operation - 5: Clear last i bits:
    public int clearIbits(int n, int i){
        int bitMask = ~0 << i;
        return n & bitMask;
    }

    //Operation - 6: Clear a range of bits:
    public int clearRangeOfBits(int n, int i, int j){
        int bitMask = (~0 << (j+1) | ((1 << i) - 1));              
        return (n & bitMask);
    }
    /*
     *      as,
     *      01 = (2 raised to the power 1) - 1
     *     011 = (2 raised to the power 2) - 1
     *    0111 = (2 raised to the power 3) - 1
     *   01111 = (2 raised to the power 4) - 1
     *  011111 = (2 raised to the power 5) - 1
     * 
     * gerneral: binary number with all 1s on right = (2 raised to the power number of 1s on the right) - 1
     */
}


public class Q2_operationsOnBit {
    public static void main(String[] args) {
        operations bitObj = new operations();
        bitObj.getBit(10, 3);
        System.out.println(bitObj.setBit(10, 0));
        System.out.println(bitObj.clearBit(10, 1));
        System.out.println(bitObj.updateBit(10, 0, 1));
        System.out.println("Number after clearing i bits: "+bitObj.clearIbits(15, 2));
        System.out.println("Number after clearing a range of bits: "+bitObj.clearRangeOfBits(2515, 2, 7));
    }
}

//NOTE: Consider doing a dry run of each and very method used above.