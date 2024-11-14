 package Threads;
 
public class ThreadPriority{
    public static void main(String[] args) {
        Printer printer = new Printer();

        PrintDoc officialDoc1 = new PrintDoc(printer, "OfficialDoc1");
        PrintDoc officialDoc2 = new PrintDoc(printer, "OfficialDoc2");

        PrintDoc unofficialDoc1 = new PrintDoc(printer, "UnofficialDoc1");
        PrintDoc unofficialDoc2 = new PrintDoc(printer, "UnofficialDoc2");

        officialDoc1.setPriority(2);
        officialDoc2.setPriority(1);
        unofficialDoc1.setPriority(9);
        unofficialDoc2.setPriority(10);

        officialDoc1.start();
        officialDoc2.start();
        unofficialDoc1.start();
        unofficialDoc2.start();
    }
}