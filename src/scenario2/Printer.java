package scenario2;

public class Printer implements SmartPrinter {

    @Override
    public void print() {
        // print
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException();
    }
}
