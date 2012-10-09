/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posprogram.customer;

/**
 *
 * @author Jwilliams96
 */
public class Customer {

    private String customerID;
    private String customerName;
    FauxCustomerDatabase thisData = new FauxCustomerDatabase();

    //search for and populates the properties from the "database"
    public Customer(final String customerID) throws IllegalArgumentException {
        this.customerID = thisData.getCustomerID(thisData.findCustomerIndex(customerID));
        this.customerName = thisData.getCustomerName(thisData.findCustomerIndex(customerID));
    }

    public final String getCustomerID() {
        return customerID;
    }

    public final String getCustomerName() {
        return customerName;
    }
}
