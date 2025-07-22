import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class subsets_duplicates {
    public static List<List<Integer>> subsetsduplicate(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=0;
            if(i>0&&arr[i]==arr[i-1]){
                start=end+1;
            }
            end= outer.size()-1;
          int n= outer.size();
          for(int j =start;j<n;j++){
            List<Integer> internal = new ArrayList<>(outer.get(j));
            internal.add(arr[i]);
            outer.add(internal);
          }
        }
        return outer;
    }
    public static void main(String args[]){
         int [] arr ={1,2,2};
      List<List<Integer>> result = subsetsduplicate(arr);
      System.out.println(result);
    }
}
