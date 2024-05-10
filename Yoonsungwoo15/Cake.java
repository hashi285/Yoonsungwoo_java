package Yoonsungwoo15;

public class Cake {
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}


class CheeseCake extends Cake{

    @Override
    public void yummy(){
       // super.yummy(); // 부모의 메소드도 실행시킨다.
        System.out.println("Yummy Cheese Cake");
    }
}


class ChocolateCheeseCake extends CheeseCake{

    @Override
    public void yummy(){
        //super.yummy(); //부모 메소드 실행
        System.out.println("Yummy Chocolate Cake");
    }


    public static void main(String[] args) {
        Cake cake = new ChocolateCheeseCake();
        // 메서드가 오버라이드 되었음으로 가장 나중에 오버라이드된
        // ChocolateCheeseCake 클래스의 yummy 메소드가 출력된다.
        cake.yummy();

        System.out.println("-----------------------------------------");

        ChocolateCheeseCake cake1 = new ChocolateCheeseCake();
        cake1.yummy();

        System.out.println("-----------------------------------------");

        Cake cake2 = new Cake();
        cake2.yummy();

    }
}
