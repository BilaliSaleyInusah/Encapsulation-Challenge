public class Main{
    
    public static void main(String[] args) {
        Printer printer = new Printer();
        // printer.fillToner(20);
        // System.out.println();
        // printer.fillToner(20);
        // System.out.println();
        // printer.fillToner(20);
        // System.out.println();
        printer.fillToner(50);
        System.out.println();
        printer.printPage(20,true);
        System.out.println();
        printer.printPage(30,false);
        System.out.println();
        printer.printPage(10,true);
        System.out.println();
        printer.printPage(20, false);
    }

}