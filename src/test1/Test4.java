package test1;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "안녕하세요";
        String s2 = "안녕하세요"; // s1과 s2는 서로 같은 주소를 가리킨다.
        String s3 = new String("안녕하세요");
        String s4 = new String("안녕하세요"); // s3와 s4는 내용은 같지만 서로 다른 주소를 가리킨다.

        if(s1 == s2) System.out.println("s1 == s2"); // True
        if(s3 == s4) System.out.println("s3 == s4"); // False
        if(s3.equals(s4)) System.out.println("s3.equals(s4)"); // True
        // == 연산자를 이용한 비교는 주소값을 비교하지만 equals 메소드는 내용을 비교한다.
    }
}
