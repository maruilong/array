package com.itmasir.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {

    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        List<BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));


        int[] integers = {0, 1, 2, 3};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[3]);

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            intList.add(i);
        }
        System.out.println(intList);
        System.out.println(intList.get(3));


    }

}

class BerylliumSphere {

    private static long counter;

    private final long id = counter++;

    @Override
    public String toString() {
        return "BerylliumSphere{" +
                "id=" + id +
                '}';
    }
}
