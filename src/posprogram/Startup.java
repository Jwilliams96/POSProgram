package posprogram;

import javax.swing.JOptionPane;
import posprogram.products.Product;

/**
 *
 * @author Jonathon
 */
public class Startup {

    public static void main(String[] args) {
        String customerID = "C65465";
        RegisterService checkout = new RegisterService(customerID);
        checkout.addProduct("G132545", 3);
        checkout.addProduct("S585165", 2);
        checkout.returnReciept();
    }
}
