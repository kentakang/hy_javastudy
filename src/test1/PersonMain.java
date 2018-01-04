package test1;

public class PersonMain {
    public static void main(String[] args) {
        // 생성자 테스트
        Person p1 = new Person("사나"); // 이름만 있는 생성자
        Person p2 = new Person(23); // 나이만 들어가는 생성자
        Person p3 = new Person("사나", 23); // 이름 나이 둘 다 들어가는 생성자

        System.out.println("이름 : " + p1.getName() + " 나이 : " + p1.getAge());
        System.out.println("이름 : " + p2.getName() + " 나이 : " + p2.getAge());
        System.out.println("이름 : " + p3.getName() + " 나이 : " + p3.getAge());

    }
}