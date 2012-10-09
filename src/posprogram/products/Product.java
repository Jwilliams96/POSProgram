/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posprogram.products;

import posprogram.discount.strategies.*;

/**
 *
 * @author jwilliams96
 */
public class Product {

    //product information
    private String productID;
    private String productName;
    private double price;
    private DiscountStrategy discount;
    private final FauxProductDatabase thisData = new FauxProductDatabase();

    /*
     * create the product and automatically assign the fields by looking up the 
     * data in the "database"
     */
    public Product(String productID) throws IllegalArgumentException {
        try {
            int index = thisData.findProductIndex(productID);
            this.productID = thisData.getProductID(index);
            this.productName = thisData.getProductName(index);
            this.price = thisData.getPrice(index);
            this.discount = thisData.getDiscount(index);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    //accessors
    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getOriginalPrice() {
        return price;
    }

    public double getDiscountedPrice() {
        return price - discount.getDiscountAmount();
    }

    public double getDiscountAmount() {
        return discount.getDiscountAmount();
    }

    //mutators for this product only does not effect the database information
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
}
