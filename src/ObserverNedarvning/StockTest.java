package ObserverNedarvning;

public class StockTest {
    public static void main(String[] args) {

        StockMarket market = new StockMarket("AAPL");

        Invester private1 = new PrivateInvestor("Anders");
        Invester pro1 = new ProfessionalInvestor("Mette");

        market.addObserver(private1);
        market.addObserver(pro1);

        market.setPrice(150.0);
        market.setPrice(165.0);
        market.setPrice(158.0);

        market.removeObserver(private1);

        market.setPrice(170.0);
    }
}
