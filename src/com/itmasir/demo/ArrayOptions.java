package com.itmasir.demo;

import java.util.Arrays;

/**
 * @author shinian
 */
public class ArrayOptions {

    public static void main(String[] args) {
        BerylliumSphere[] a;

        BerylliumSphere[] b = new BerylliumSphere[5];
        System.out.println(Arrays.toString(b));

        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            c[i] = new BerylliumSphere();
        }

        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};

//        System.out.println("a length " + a.length);
        System.out.println("b length " + b.length);
        System.out.println("c length " + c.length);
        System.out.println("d length " + d.length);
        a = d;
        System.out.println("a length " + a.length);



    }
}
