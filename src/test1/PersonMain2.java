package test1;

public class PersonMain2 {
    public static void main(String[] args) {
        Person[] p = new Person[9];

        for(int i = 0; i < 9; i++) {
            p[i] = new Person("트와이스 " + (i + 1) + "번째 멤버");
        }

        for(int i = 0; i < 9; i++) {
            System.out.println("이름 : " + p[i].getName() + " 나이 : " + p[i].getAge());
        }
    }
}
