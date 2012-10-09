package posprogram;

import java.text.NumberFormat;
import java.util.Locale;
import posprogram.products.*;

/**
 *
 * @author Jwilliams96
 */
public class LineItem {

    private final NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    private Product newItem;
    private int quantity;

    public LineItem(String productID, int quantity) throws IllegalArgumentException {
        try {
            newItem = new Product(productID);
            this.quantity = quantity;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public final double getOriginalPrice() {
        return newItem.getOriginalPrice() * quantity;
    }

    public final double getDiscountAmount() {
        return newItem.getDiscountAmount() * quantity;
    }

    public final double getDiscountedPrice() {
        return newItem.getDiscountedPrice() * quantity;
    }

    @Override
    public final String toString() {
        StringBuilder output = new StringBuilder("");
        output.append("\n");
        output.append(newItem.getProductName());
        output.append("|");
        output.append(nf.format(newItem.getOriginalPrice()));
        output.append("|");
        output.append(quantity);
        output.append("|");
        output.append(nf.format(quantity * newItem.getOriginalPrice()));
        return output.toString();
    }
}
