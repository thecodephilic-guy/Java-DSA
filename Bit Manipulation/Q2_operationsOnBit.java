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
        System.out.print("The number after setting the "+i+"th bit is: ");
        return (n | bitMask);
    }

    //Operation - 3: Clear ith bit:
    public int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        System.out.print("The number after clearing the "+i+"th bit is: ");
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
}


public class Q2_operationsOnBit {
    public static void main(String[] args) {
        operations bitObj = new operations();
        bitObj.getBit(10, 3);
        System.out.println(bitObj.setBit(10, 0));
        System.out.println(bitObj.clearBit(10, 1));
        System.out.println(bitObj.updateBit(10, 0, 1));
    }
}

//NOTE: Consider doing a dry run of each and very method used above.