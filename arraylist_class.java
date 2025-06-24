import java.util.ArrayList;
import java.util.Collections;

class arraylist_class{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        //adding elements to the arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // getting elements using index
        int element = list.get(0);
        System.out.println(element);

        //adding elements in between
        list.add(1,5);
        System.out.println(list);

        //modifing the elements based on index
        list.set(2,8);
        System.out.println(list);
        //deleting elements

        list.remove(3);
        //finding the size of the arraylist
        int size= list.size();
        System.out.println(size);
        
        //sorting the list
        Collections.sort(list);
        System.out.println(list);
    }
}