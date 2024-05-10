package Yoonsungwoo13;

public class Array1 {
    public static void main(String[] args) {
        // 길이가 5인 1차원 인스턴스 배열 생성
        int[] a = new int [5];


        // 배열 인스턴스와 찹조변수 분리
        int[] b ;
        b = new int [5];


        // 배열의 인스턴스 변수 접근
        System.out.println(" 배열 a 의 길이는 " + a.length);
        System.out.println(" 배열 b 의 길이는 " + b.length);
    }
}
