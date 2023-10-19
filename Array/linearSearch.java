//Program for linear searching:

public class linearSearch{

    public static int linSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int numbers[] = {2, 4, 5, 7, 3, 9};
        int key1 = 3;
        int index = linSearch(numbers, key1);

        if(index == -1){
            System.out.println("The number is not present in the array.");
        }
        else{
            System.out.println("The number found at index: "+index);
        }
    }
}