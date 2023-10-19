import java.util.Scanner;
//Question: Count how many times lowercase vowels occurred in a String enterd by the user.
public class lowerCaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String userString = sc.nextLine();
        sc.close();
        
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}