import java.util.Scanner;

public class amstrong{
    public static boolean amstrongnumber(int number){
        double sum=0;
        int original= number;
        int length = 0;
        while(number!=0){
            number =number/10;
            length++;

        }
        number = original;
        while(number!=0){
            int digit = number%10;
            sum =sum+ Math.pow(digit, length);
            number=number/10;

        }
        return original==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(!amstrongnumber(number)){
            System.out.println(" not amstrong number");

        }else{
            System.out.println("amstrong number");
        }
        
                sc.close();

    }
}
