package Yoonsungwoo06_MethodAndScope;

public class MethodDef {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        hiEveryone(12); // hiEveryone 메소드 int 값 12 넣어주고 시작
        hiEveryone(13);
        System.out.println("프로그램 끝");
    }
    public static void hiEveryone(int age){
        System.out.println("좋은 아침입니다. " + "제 나이는 " + age + "살 입니다.");
    }
}
