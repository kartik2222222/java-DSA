public class fact {
  public  static int  factorial(int n){
    if(n==0||n==1){
      return 1;
    }else{
      return n*factorial(n-1);
    }
    
  }
  public static int fabinoci(int n){
      if(n==0){
        return 0;
      }else if(n==1){
        return 1;
      }
      else{
       return fabinoci(n-1)+fabinoci(n-2);
      }
      
    }
   
    // fabinoc series using iterative method
    public static void fabiseries_iterative(int n){
      int a=0;
      int b = 1;
      System.out.print("fabiseries:"+ a+" "+b);
      for(int i=2;i<n;i++){
        int next = a+b;
        System.out.print(" "+next);
        a=b;
        b=next;

      }
    
    }
    public static void main(String args[]){
      System.out.println(factorial(5));
      System.out.println(fabinoci(5));
      fabiseries_iterative(5);
    }
}
