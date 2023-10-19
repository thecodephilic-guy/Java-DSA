public class reverseAnArray{
    public static void arrayRerverse(int numbers[]){
        int start = 0, end = numbers.length-1;
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
        System.out.print("The reversed array is: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        return;
    }
    public static void main(String[] args){

        int numbers[] = {2, 4, 8, 10};
        arrayRerverse(numbers);
    }
}