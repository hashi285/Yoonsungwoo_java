package Yoonsungwoo14;

class Man {
    String name;

    public void man(String name) {
        System.out.println("My name is " + name);
    }
}


class BusinessMan extends Man {
    String company;
    String position;

    public void businessMan(String company, String position) {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);


    }

    public static void main(String[] args) {
        BusinessMan man = new BusinessMan();
        man.businessMan("삼성" , "사무직");
        man.man("문수혁");

    }
}
