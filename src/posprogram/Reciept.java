package posprogram;

import java.text.NumberFormat;
import java.util.Locale;
import posprogram.customer.*;

/**
 *
 * @author jwilliams96
 */
public class Reciept {

    private LineItem[] thisSale = new LineItem[0];
    private Customer thisCustomer;
    private int amountOfItems = 0;
    private final NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    public Reciept(final String customerID) {
        thisCustomer = new Customer(customerID);
    }

    public final void addLineItem(String productID, int amount) throws IllegalArgumentException {
        try {
            increaseArraySize(thisSale);
            thisSale[amountOfItems] = new LineItem(productID, amount);
            amountOfItems++;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public final String toString() {
        double totalPrice = 0;
        double totalDiscountAmount = 0;
        double totalDiscountPrice = 0;

        StringBuilder output = new StringBuilder("");
        output.append("Customer: ");
        output.append(thisCustomer.getCustomerName());
        for (int i = 0; i < thisSale.length; i++) {
            totalPrice += thisSale[i].getOriginalPrice();
            totalDiscountAmount += thisSale[i].getDiscountAmount();
            totalDiscountPrice += thisSale[i].getDiscountedPrice();

            output.append(thisSale[i].toString());
        }
        output.append("\nTotal Original Price: ").append(nf.format(totalPrice));
        output.append("\nTotal Discount Amount: ");
        output.append(nf.format(totalDiscountAmount));
        output.append("\nTotal Discounted Price: ");
        output.append(nf.format(totalDiscountPrice));
        return output.toString();
    }

    private void increaseArraySize(LineItem[] newItems) throws IllegalArgumentException {
        LineItem[] tempArray = new LineItem[amountOfItems + 1];
        for (int i = 0; i < amountOfItems; i++) {
            tempArray[i] = newItems[i];
        }
        this.thisSale = new LineItem[amountOfItems + 1];
        this.thisSale = tempArray;
    }
}
