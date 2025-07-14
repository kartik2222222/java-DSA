import java.util.Scanner;
public class recursion {
    public static  int  factorial(int n){
       if(n==0){
        return 1;
       }
       return n*factorial(n-1);}
    public static int sumof_n_numbers(int n){
      int sum=0;
        if(n==0) return 0;
        if(n==1) return 1;
        sum =n+sumof_n_numbers(n-1); 
        return sum;
    }
    public static int fabi(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return(fabi(n-1)+fabi(n-2));
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int result ;
       result=factorial(n);
       System.out.println(result);
       int sum = sumof_n_numbers( n);
       System.out.println("sum of first"+n+" numbers is "+sum);
       int fabi = fabi(n);
       System.out.println("fabinoc nummber at"+n+"  is "+fabi);


    }
}
