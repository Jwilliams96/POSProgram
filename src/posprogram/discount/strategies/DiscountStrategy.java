package posprogram.discount.strategies;

/**
 *
 * @author jwilliams96
 */
public interface DiscountStrategy {
    //all discount strategy's should be constructed with the price
    double getDiscountAmount();
    
    //Factory method
//    public abstract DiscountStrategy getInstance(double price);
}
