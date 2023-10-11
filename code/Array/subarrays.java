public class subarrays{

    public static void printSubarrays(int data[]){
        int ts = 0;
        //outer loop:
        for(int i=0; i<data.length; i++){
            System.out.print("[ "+data[i]+" ] ");
            ts++;
            //inner loop:
            for(int j=i+1; j<data.length; j++){
                //loop for printing:
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(" "+data[k]+" ");
                }
                ts++;
                System.out.print("] ");
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
        return;
    }

    public static void main(String[] args) {
        int data[] = {2, 4, 6, 8, 10};
        printSubarrays(data);
    }
}