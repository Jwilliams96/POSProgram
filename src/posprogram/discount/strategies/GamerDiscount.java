package posprogram.discount.strategies;

/**
 *
 * @author jwilliams96
 */
public class GamerDiscount implements DiscountStrategy{
    
    private double price;
    private final double DICOUNT_AMOUNT = .42;

    public GamerDiscount(double price) {
        // needs validation
        this.price = price;
    }
    
    public final double getDiscountAmount(){
        return price * DICOUNT_AMOUNT;
    }
}
