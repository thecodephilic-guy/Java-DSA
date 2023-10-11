/*
            if array is [2, 4, 6, 8, 10]

            then pairs are:
            (2,4) (2,6) (2,8) (2,10)
            (4,6) (4,8) (4,10)
            (6,8) (6,10)
            (8,10)
 */



public class pairsInAnArray{

    public static void printPairs(int data[]){

        int totalPairs = 0;
        for(int i=0; i<data.length; i++){
            for(int j=i+1; j<data.length; j++){
                System.out.print("("+data[i]+","+data[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("The total number of paris are: "+totalPairs);
        return;
    }

    public static void main(String[] args) {
        int data[] = {2, 4, 6, 8, 10};
        printPairs(data);

    }
}