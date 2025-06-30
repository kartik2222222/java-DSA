import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmap_ {
    public static void main(String args[]){
     HashMap <String,Integer> map = new HashMap<>();
     //inserting key-value pairs into map
     map.put("class1",20);
     map.put("class2",30);
     map.put("class3",35);
     map.put("class3",40);
     System.out.println(map);
     //searching
     if(map.containsKey("class3")){
        System.out.println("yes");
     }else{ System.out.println("no");}
     //getting value with key
     System.out.println(map.get("class3"));
     //iteration
     for(Map.Entry<String,Integer> e:map.entrySet()){
       System.out.println(e.getKey());
       System.out.println(e.getValue());
     }
    Set<String> keys = map.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + map.get(key));
       }
     ///deleting entire pair
     map.remove("class3");
     System.out.println(map);



    }
    
}
