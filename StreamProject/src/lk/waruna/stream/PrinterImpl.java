package lk.waruna.stream;

public class PrinterImpl implements Printer{


    Printer printer = str-> System.out.println(str.toUpperCase());

    public void printHtml(){

    }

    public void printText(){

    }

    @Override
    public void print(String message) {

    }
}
