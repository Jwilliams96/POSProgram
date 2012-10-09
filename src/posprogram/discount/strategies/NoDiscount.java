package posprogram.discount.strategies;

/**
 *
 * @author jwilliams96
 */
public class NoDiscount implements DiscountStrategy{
    private double price;
    private final double DICOUNT_AMOUNT = 0;
    
//    public DiscountStrategy getInstance(double price) {
//       return new NoDiscount(price);
//    }

    public NoDiscount(double price) {
        this.price = price;
    }
    
    @Override
    public double getDiscountAmount(){
        return price * DICOUNT_AMOUNT;
    }
}
