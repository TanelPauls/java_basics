package week9.ex21;

public class Main {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}

