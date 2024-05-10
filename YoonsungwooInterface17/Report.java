//package hi;
//
//interface Upper { }   // 마커 인터페이스
//interface Lower { }   // 마커 인터페이스
//
//interface Printable3 {
//    String getContents();
//}
//
//class Report implements Printable3, Upper {
//    String cons;
//
//    Report(String cons) {
//        this.cons = cons;
//    }
//    public String getContents() {
//        return cons;
//    }
//}
//
//public void printContents(Printable3 doc) {
//    if(doc instanceof Upper) {
//        System.out.println((doc.getContents()).toUpperCase());
//    }
//    else if(doc instanceof Lower) {
//        System.out.println((doc.getContents()).toLowerCase());
//    }
//    else
//        System.out.println(doc.getContents());
//}
//
//public void main() {
//}
//
