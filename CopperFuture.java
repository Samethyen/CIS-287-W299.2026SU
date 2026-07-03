public class CopperFuture extends FutureContract {

    public CopperFuture(double underlyingPrice,
                        double optionPrice,
                        double timeToExpiration) {

        super("Copper", underlyingPrice, optionPrice, timeToExpiration);
    }

    public CopperFuture(CopperFuture other) {
        super(other);
    }

    @Override
    public double computeImpliedVolatility() {

        System.out.println("Calculating Copper Implied Volatility...");
        return super.computeImpliedVolatility();
    }
}