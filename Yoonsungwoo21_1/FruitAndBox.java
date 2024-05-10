package Yoonsungwoo21_1;

public class FruitAndBox {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        aBox.set("apple");
        oBox.set("orange");

        Apple ap = (Apple)aBox.get();
        Orange og = (Orange)oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
