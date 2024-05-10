interface Printable1 {
    void printLine(String str);
}

class SimplePrinter implements Printable1 {
    public void printLine(String str) {
        System.out.println(str);
    }
}

class MultiPrinter extends SimplePrinter {
    public void printLine(String str) {
        super.printLine("start of multi...");
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public void main(String[] args) {
    Printable1 prn1 = new SimplePrinter();
    Printable1 prn2 = new MultiPrinter();

    if (prn1 instanceof Printable1)
        prn1.printLine("This is a simple printer.");
    System.out.println();

    if (prn2 instanceof Printable1)
        prn2.printLine("This is a multiful printer.");
}


