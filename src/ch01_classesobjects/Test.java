package ch01_classesobjects;

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
