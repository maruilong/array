package com.itmasir.demo.util;

/**
 * @author shinian
 * @date 2017/11/29/029
 */
public class GeneratorsTest {

    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getSimpleName() + " :");

            try {
                Generator<?> generator = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(generator.next() + " ");
                }
                System.out.println("");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }

}
