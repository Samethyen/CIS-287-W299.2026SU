public class Main {

    public static void main(String[] args) {

        GoldFuture gold = new GoldFuture(1950.50, 45.20, 0.50);
        CopperFuture copper = new CopperFuture(4.10, 0.30, 0.70);
        CoffeeFuture coffee = new CoffeeFuture(180.00, 6.50, 1.00);

        System.out.println("Original Contracts:");
        gold.displayContract();
        copper.displayContract();
        coffee.displayContract();

        System.out.println("\nCopy Constructor Demo:");
        GoldFuture goldCopy = new GoldFuture(gold);
        goldCopy.displayContract();

        FutureContract[] contracts = {
                gold,
                copper,
                coffee,
                goldCopy
        };

        System.out.println("\nContracts in Array:");

        for (FutureContract contract : contracts) {
            contract.displayContract();
        }
    }
}