package posprogram.discount.strategies;

/**
 *
 * @author jwilliams96
 */
public class SportsDiscount implements DiscountStrategy {
    private double price;
    private final double DICOUNT_AMOUNT = .05;

    public SportsDiscount(double price) {
        this.price = price;
    }
    
    @Override
    public double getDiscountAmount(){
        return price * DICOUNT_AMOUNT;
    }
}
