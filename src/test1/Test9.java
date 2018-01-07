package test1;

class StaticTest {
    public static void print() {
        System.out.println("Hello");
    }
}

public class Test9 {
    public static void main(String[] args) {
        // StaticTest st = new StaticTest();
        // st.print();
        StaticTest.print();
    }
}

