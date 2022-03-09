package com.java.collections.list.arrayList;

import org.junit.Before;
import org.junit.Test;

public class CustomArrayListImplementationTest {

    public static CustomArrayListImplementation<String> customList;

    @Before
    public void setUp() {
        customList = new CustomArrayListImplementation<>();
    }

    @Test
    public void testGet() {
        customList.add("algo");
        System.out.println(customList.get(0));
        System.out.println(customList.size());
    }

    @Test
    public void testAdd() {
        System.out.println();
    }

    @Test
    public void testRemove() {
        customList.add("One");
        System.out.println(customList.size());
        customList.add("Two");
        System.out.println(customList.size());
        customList.add("Three");
        System.out.println(customList.size());

        System.out.println(customList.remove(2));
        System.out.println(customList.size());
        System.out.println(customList.remove(1));
        System.out.println(customList.size());
        System.out.println(customList.remove(0));
        System.out.println(customList.size());
        //System.out.println(customList.remove(0));
    }

}