package Yoonsungwoo06_MethodAndScope;


// 스코프란  임의의 변수에 대한 변수의 접근 가능 영역 또는 변수가 소묠되지 않고 존재할 수 있는 영역을 의미한다.



public class Localvariable {
    public static void main(String[] args) {
        boolean ste = true;
        int num1 = 11;

        if(ste){
           // int num1 = 11;   // 주석을 없애면 오류가 난다.
            num1 ++;
            System.out.println(num1);
        }

    }
}
