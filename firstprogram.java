import java.lang.reflect.Array;
import java.util.Scanner;
//program to reverse a string
class firstprogram {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");

    for(int i =0;i<sb.length()/2;i++){
        int front = i;
        int back = sb.length()-i-1;
        char startchar = sb.charAt(front);
        char lastchar= sb.charAt(back);
        sb.setCharAt(i, lastchar);
        sb.setCharAt(back, startchar);
    }
       System.out.println(sb);
        }
}
