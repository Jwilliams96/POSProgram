package posprogram.products;

import posprogram.discount.strategies.*;

/**
 *
 * @author Jonathon
 */
public class FauxProductDatabase {
    /*
     * "database information" where the columns would be the variables and the 
     * values in the array would be the differect row values
     */
    private String productID[] = {"G132545", "S585165", "C641618"};
    private String productName[] = {"PS3", "BaseBall", "Xbox"};
    private double price[] = {299.99, 9.99, 199.99};
    private DiscountStrategy[] discount = {new GamerDiscount(price[0]),
        new SportsDiscount(price[1]), new NoDiscount(price[2])};

    //Search for the location of the prodcut in the "database"
    public int findProductIndex(String productID) throws 
            IllegalArgumentException {
        int index = -1;

        for (int i = 0; i < this.productID.length; i++) {
            if (productID.equals(this.productID[i])) {
                index = i;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException();
        }
        return index;
    }

    //accessor methods of the values at the index i
    public String getProductID(int i) {
        return productID[i];
    }

    public String getProductName(int i) {
        return productName[i];
    }

    public double getPrice(int i) {
        return price[i];
    }

    public DiscountStrategy getDiscount(int i) {
        return discount[i];
    }
    
    //mutator methods of the values at the index i
    public void setProductID(String productID, int i) {
        this.productID[i] = productID;
    }

    public void setProductName(String productName, int i) {
        this.productName[i] = productName;
    }

    public void setPrice(double price, int i) {
        this.price[i] = price;
    }

    public void setDiscount(DiscountStrategy discount, int i) {
        this.discount[i] = discount;
    }
}
