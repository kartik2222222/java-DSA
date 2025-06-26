import java.util.Scanner;

public class PalindromeCheck {
    public static boolean PalindromeCheck1(int number){
        int original = number;
        int reverse = 0;
        while ((original!=0)) {
            int digit = original%10;
            reverse = reverse*10+digit;
            original = original/10;
        }

     return number == reverse;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          if(!PalindromeCheck1(n)){
            System.out.println("not palindrome");
          }
          else{
            System.out.println("palindrome");

          }
          sc.close();
        
    }
}
