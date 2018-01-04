package test1;

public class Test6 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("매개변수가 없습니다."); // 매개변수가 없을 시 오류 처리
            return;
        }

        System.out.println(args[0]);
    }
}
