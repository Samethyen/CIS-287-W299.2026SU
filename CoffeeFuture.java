public class CoffeeFuture extends FutureContract {

    public CoffeeFuture(double underlyingPrice,
                        double optionPrice,
                        double timeToExpiration) {

        super("Coffee", underlyingPrice, optionPrice, timeToExpiration);
    }

    public CoffeeFuture(CoffeeFuture other) {
        super(other);
    }

    @Override
    public double computeImpliedVolatility() {

        System.out.println("Calculating Coffee Implied Volatility...");
        return super.computeImpliedVolatility();
    }
}