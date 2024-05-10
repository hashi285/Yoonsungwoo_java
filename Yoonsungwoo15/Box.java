package Yoonsungwoo15;

class Box { // Box 클래스 선언
    public void simpleWrap() {
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box { // Box 클래스를 상속하는 PaperBox 클래스 선언
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox { // PaperBox 클래스를 상속하는 GoldPaperBox 클래스 선언
    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }



    public static void wrapBox(Box box) {  // Box의 매개변수 box 선언
        if (box instanceof GoldPaperBox) {
            ((GoldPaperBox)box).goldWrap();
        }
        else if (box instanceof PaperBox) {
            ((PaperBox)box).paperWrap();
        }
        else {
            box.simpleWrap();
        }
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

}
