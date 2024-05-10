package Yoonsungwoo15;

class MobilePhone {
    protected String number;     // 전화번호

    public MobilePhone(String num) {
        number = num;
    }
    public void answer() {
        System.out.println("Hi~ from " + number);
    }
}
class SmartPhone extends MobilePhone {
    private String androidVer;   // 안드로이드 운영체제 네임(버전)

    public SmartPhone(String num, String ver) { // 인자값을 String 형으로 2개 받는 SmartPhone 메소드 선언
        super(num);
        androidVer = ver;
    }
    public void playApp() {
        System.out.println("App is running in " + androidVer);
    }

    public static void main(String[] args) { // 메인 메소드
        SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
        phone.answer();   // 전화를 받는다.
        phone.playApp();   // 앱을 선택하고 실행한다.
    }

}
