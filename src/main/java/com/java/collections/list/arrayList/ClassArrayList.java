package com.java.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClassArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //Update the maximum capacity manually
        arrayList.ensureCapacity(2);
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        //Reverse an ArrayList
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        //Remove duplicates
        Set<String> set = new HashSet<>(arrayList);
        System.out.println(set);

        //Synchronize
        //Method 1
        List<String> arrayListSync = Collections.synchronizedList(arrayList);
        System.out.println(arrayListSync);
        //Method 2
        CopyOnWriteArrayList<String> arrayListSyncTwo = new CopyOnWriteArrayList<>(arrayList);
        System.out.println(arrayListSyncTwo);

        //Sort an ArrayList
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //Getting a sublist
        List<String> subList = arrayList.subList(1, 3);
        System.out.println(subList);

        //Remove objects
        arrayList.remove(2);
        System.out.println(arrayList);

        //Reverse in desceding order
        arrayList.sort(Collections.reverseOrder());
        System.out.println(arrayList);
    }

}
