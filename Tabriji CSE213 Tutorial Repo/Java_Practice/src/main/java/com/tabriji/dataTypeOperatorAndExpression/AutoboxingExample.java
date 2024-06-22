package com.tabriji.dataTypeOperatorAndExpression;

public class AutoboxingExample {

    public static void main(String[] args) {
        AutoboxingExample example = new AutoboxingExample();
        int a = 5;
        int b = 10;
        System.out.println(example.add(a, b));
    }

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

}
