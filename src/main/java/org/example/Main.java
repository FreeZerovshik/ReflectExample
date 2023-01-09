package org.example;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        A aa = new A();

        System.out.println(aa.getA());

        Field f = aa.getClass().getDeclaredField("a");

        f.setAccessible(true);

        f.set(aa, "Test message");

        System.out.println(aa.getA());

    }
}