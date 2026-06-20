package ObserverNedarvning;

public class PrivateInvestor extends Invester{


    public PrivateInvestor(String navn) {
        super(navn);
    }

    @Override
    public void update(String symbol, double price) {
        System.out.println(getNavn() + ": " + symbol + " kurs = " + price);
    }
}
