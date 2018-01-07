package test1;

public class Son extends Father {
    public Son() {
        System.out.println("아들의 기본 생성자");
    }

    public Son(int i) {
        System.out.println("아들의 매개변수 " + i + " 있는 생성자");
    }

    public void print() {
        System.out.println("아들의 print 메소드");
    }
}
