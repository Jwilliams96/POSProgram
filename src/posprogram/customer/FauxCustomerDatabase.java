package posprogram.customer;

/**
 *
 * @author Jonathon
 */
public class FauxCustomerDatabase {

    private String customerID[] = {"C65465", "F65468", "O86465"};
    private String customerName[] = {"Jonathon", "Alex", "Sean"};

    public final int findCustomerIndex(String customerID) 
            throws IllegalArgumentException {
        int index = -1;

        for (int i = 0; i < this.customerID.length; i++) {
            if (customerID.equals(this.customerID[i])) {
                index = i;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException();
        }
        return index;
    }

    //accessors for the values at the index i
    public final String getCustomerID(int i) {
        return customerID[i];
    }

    public final String getCustomerName(int i) {
        return customerName[i];
    }

    //mutators to change the values at the index i
    public final void setCustomerID(String customerID, int i) {
        this.customerID[i] = customerID;
    }

    public final void setCustomerName(String customerName, int i) {
        this.customerName[i] = customerName;
    }
    
    
}
