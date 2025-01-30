package com.core.ch01.basics;

public class Test {

    public static class MyInner {
        public MyInner() {
            System.out.println("Hi");
        }
    }

    public static void main(String[] args) {
        MyInner mi = new MyInner();

    }
}
