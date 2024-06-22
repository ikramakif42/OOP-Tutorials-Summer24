package com.tabriji.dataTypeOperatorAndExpression;

public class UnboxingExample {

    public static void main(String[] args) {
        UnboxingExample example = new UnboxingExample();
        Integer a = 5;
        Integer b = 10;
        System.out.println(example.add(a, b));
    }

    public int add(int a, int b) {
        return a + b;
    }

}
