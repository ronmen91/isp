package scenario1;

public class EconomicPrinter implements SmartPrinter{

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
