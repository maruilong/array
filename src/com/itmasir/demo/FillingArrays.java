package com.itmasir.demo;

import java.util.Arrays;

/**
 * @author shinian
 * @date 2017/11/29/029
 */
public class FillingArrays {
    public static void main(String[] args) {

        boolean[] a = new boolean[6];

        Arrays.fill(a, true);

        System.out.println(Arrays.toString(a));

    }
}
