package test1;

import java.util.HashSet;

public class Test8 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        // 자료 구조를 통해 로또 프로그램을 만들어보자.
        while(hs.size() < 6) {
            hs.add((int)(Math.random() * 45 + 1));
        }

        System.out.println("당신의 로또 번호는 " + hs + " 입니다.");

        /* 자료구조 기초 예제
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs); // 자료구조에 들어가 있는 값 출력
        hs.add(2);
        System.out.println(hs); // 중복된 값은 한 번만 들어감
        System.out.println(hs.size()); // 자료구조의 크기 출력 */
    }
}
