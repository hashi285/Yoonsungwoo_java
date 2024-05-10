package YoonsungwooInterface17;

// Interface에 상속이 필요한 이유

interface PrintableColer extends Printable {
    void printCMYK(String doc);
}

public class PrnColor implements PrintableColer{
     @Override
    public void print(String doc) {
         System.out.println("Color: WHITE AND BLICK" );
         System.out.println(doc);
     }

     @Override
    public void printCMYK(String doc) {
         System.out.println("Color: CMYK");
         System.out.println(doc);
     }
}
