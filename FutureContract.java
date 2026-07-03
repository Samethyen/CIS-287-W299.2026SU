import java.util.Random;

public abstract class FutureContract {

    protected String name;
    protected double underlyingPrice;
    protected double optionPrice;
    protected double timeToExpiration;

    public FutureContract(String name,
                          double underlyingPrice,
                          double optionPrice,
                          double timeToExpiration) {

        this.name = name;
        this.underlyingPrice = underlyingPrice;
        this.optionPrice = optionPrice;
        this.timeToExpiration = timeToExpiration;
    }

    public FutureContract(FutureContract other) {

        this.name = other.name;
        this.underlyingPrice = other.underlyingPrice;
        this.optionPrice = other.optionPrice;
        this.timeToExpiration = other.timeToExpiration;
    }

    public double computeImpliedVolatility() {

        Random rand = new Random();
        return 10 + rand.nextDouble() * 40;
    }

    public void displayContract() {

        System.out.println("----------------------------");
        System.out.println("Contract: " + name);
        System.out.println("Underlying Price: " + underlyingPrice);
        System.out.println("Option Price: " + optionPrice);
        System.out.println("Time To Expiration: " + timeToExpiration);
        System.out.printf("Implied Volatility: %.2f%%%n",
                computeImpliedVolatility());
    }
}