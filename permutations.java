public class permutations {
    public static void main(String[] args) {
        permutationsall("","abc");
    }

    public static void permutationsall(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutationsall(first+ch+second, up.substring(1));
        }
    }
}
