package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");
        hs.add("Six");
        System.out.println("Original Set is::");
        System.out.println();
        for(String item0: hs){
            System.out.println(item0);
        }
        System.out.println("Size of hashset is : "+hs.size());
        System.out.println("Removed the item : "+hs.remove("Five"));
        System.out.println("Removing the item that is not present : "+hs.remove("Seven"));
        if(hs.contains("Four")){
            System.out.println("Element is present in set");
        } else{
            System.out.println("Element is not present in set");
        }
        System.out.println("Updated list is::");
        System.out.println();
        for(String item: hs){
            System.out.println(item);
        }

    }
}
