package posprogram;

import javax.swing.JOptionPane;
import posprogram.customer.*;

/**
 *
 * @author jwilliams96
 */
public class RegisterService {

    private Reciept thisBill;

    public RegisterService(String customerID) {
        thisBill = new Reciept(customerID);
    }

    public final void addProduct(String productID, int quantity) throws IllegalArgumentException {
        try {
            thisBill.addLineItem(productID, quantity);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public final void returnReciept() {
        JOptionPane.showMessageDialog(null, thisBill.toString());
    }
}
