package com.itmasir.demo;

import java.util.Arrays;

/**
 * @author shinian
 * @date 2017/11/29/029
 */
public class CopyArrays {

    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];

        Arrays.fill(i, 7);
        Arrays.fill(j, 8);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));

        System.arraycopy(i, 0, j, 0, i.length);

        System.out.println(Arrays.toString(j));
    }
}
