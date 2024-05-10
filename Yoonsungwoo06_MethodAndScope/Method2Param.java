package Yoonsungwoo06_MethodAndScope;

public class Method2Param {
    public static void main(String[] args) {
        String myhight = "180";  // myhight 변수에 "180" 문자열로 초기화
        hieveryone(2024, 24, myhight);  // hieveryone 메소드 실행
        byeeveryone();  //byeeveryone 메소드 실행
    }

    public static void hieveryone(int a, int b, String c){
        System.out.println("현재 " + a + "년이고, 제 나이는 " + b + "살이며 " + "키는 " + c + "입니다.");
    }
    public static void byeeveryone(){
        System.out.println("모두 안녕!");
    }
}
