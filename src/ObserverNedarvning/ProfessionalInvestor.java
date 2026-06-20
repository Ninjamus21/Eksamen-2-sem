package ObserverNedarvning;

public class ProfessionalInvestor extends Invester {

    private double currentPrice;

    public ProfessionalInvestor(String navn) {
        super(navn);
    }

    @Override
    public void update(String symbol, double price) {
        if (price == currentPrice || currentPrice == 0) {
            System.out.println(getNavn() + ": " + symbol + " kurs = " + price + "(ændring: N/A)");
        } else {
            System.out.println(getNavn() + ": " + symbol + " kurs = " + price + "(ændring: " + ((price - currentPrice) / currentPrice) * 100 + "%");

        }
        currentPrice = price;
    }
}
