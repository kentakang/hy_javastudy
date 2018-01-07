package test1;

public class Father {
    public Father() {
        System.out.println("아버지의 기본 생성자");
    }

    public Father(int i) {
        System.out.println("아버지의 매개변수 " + i + " 있는 생성자");
    }

    public void print() {
        System.out.println("아버지의 print 메소드");
    }
}
