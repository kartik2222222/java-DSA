import java.util.Scanner;

public class perfectnumber{

    public static boolean perfectnumber2(int number){
       int original = number;
       int sum=0;
       for(int i=1;i<number;i++){
        if(original%i==0){
            sum=sum+i;
        }
       }

        return number==sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(!perfectnumber2( number)){
            System.out.println("not perfect number");
        }
        else{
            System.out.println("perfect number");
        }
        sc.close();
        }
}