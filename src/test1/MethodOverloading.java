package test1;

class MyClass {
    // 메소드 오버로딩

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(String a, String b) {
        System.out.println(a + b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.add(11, 22);
        mc.add("TWICE♥", "ONCE");
    }
}
