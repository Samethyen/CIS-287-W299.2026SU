public class GoldFuture extends FutureContract {

    public GoldFuture(double underlyingPrice,
                      double optionPrice,
                      double timeToExpiration) {

        super("Gold", underlyingPrice, optionPrice, timeToExpiration);
    }

    public GoldFuture(GoldFuture other) {
        super(other);
    }

    @Override
    public double computeImpliedVolatility() {

        System.out.println("Calculating Gold Implied Volatility...");
        return super.computeImpliedVolatility();
    }
}