import java.util.Scanner;
class subsets{

    public static void  skip_a(String p,String up){   
        if(up.isEmpty()){
            System.out.println(p);
           return ;
        }
        char ch = up.charAt(0);
        if(ch =='a'){
            skip_a(p,up.substring(1));
          
        }else{
            skip_a(p+ch,up.substring(1));
        }   
    }
    public static String skip_a1_ans_in_body(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch= up.charAt(0);
        if(ch =='a' ){
            return(skip_a1_ans_in_body(up.substring(1)));
        }
        else{
            return ch+skip_a1_ans_in_body(up.substring(1));
        }
    }
    public static void skipapple(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        if(up.startsWith("apple")){
            skipapple(p, up.substring(5));
        }
        else{
            char ch = up.charAt(0);
            skipapple(p+ch, up.substring(1));
        }
    }
    public static void skip_app_not_apple(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        if(up.startsWith("app") && !up.startsWith("apple")){
           skip_app_not_apple( p, up.substring(3));
        }
        else{
            
            skip_app_not_apple(p+up.charAt(0),up.substring(1));
        }
    }
    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.err.println(p);
            return;
        }{
            char ch = up.charAt(0);
            subseq(p+ch, up.substring(1));
            subseq(p, up.substring(1));

        }
    }

    public static void subseqaAcii(String p,String up){
     if(up.isEmpty()){
        System.out.println(p);
        return;}

        char ch = up.charAt(0);

        subseqaAcii(p, up.substring(1));
        subseqaAcii(p+ch, up.substring(1));
        subseqaAcii(p+(ch+0), up.substring(1));
    
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String up = sc.next();
      String p="";
      skip_a(p,up);
      String result =skip_a1_ans_in_body(up);
      System.out.println(result);
      skipapple(p,up);
      skip_app_not_apple(p,up);

      subseqaAcii(p, up);
      sc.close();
    }
}