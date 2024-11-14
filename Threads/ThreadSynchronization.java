package Threads;



class Printer {
    public synchronized void printDocument(String docName) {
        System.out.println("Printing document: " + docName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished printing: " + docName);
        System.out.println();
    }
}

class PrintDoc extends Thread {
    Printer printer;
    String docName;

    PrintDoc(Printer printer, String docName) {
        this.printer = printer;
        this.docName = docName;
    }

    public void run() {
        printer.printDocument(docName);
    }
}

public class ThreadSynchronization{
    public static void main(String[] args) {
        Printer printer = new Printer();

        PrintDoc officialDoc1 = new PrintDoc(printer, "OfficialDoc1");
        PrintDoc officialDoc2 = new PrintDoc(printer, "OfficialDoc2");

        PrintDoc unofficialDoc1 = new PrintDoc(printer, "UnofficialDoc1");
        PrintDoc unofficialDoc2 = new PrintDoc(printer, "UnofficialDoc2");

        officialDoc1.start();
        officialDoc2.start();
        unofficialDoc1.start();
        unofficialDoc2.start();
    }
}