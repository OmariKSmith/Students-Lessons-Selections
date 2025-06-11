package org.javaclass.exercises;

//!                             Alter the isInStock method to check quantity before
//!                             returning it's value.
//!                             If quantity is < 1 return false
class OrderItem {
    String itemName;
    boolean inStock;
    double price = 45.50;
    int quantity = 4;
    long itemNumber = 83454544456794366L;

    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem();
        System.out.println(orderItem);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "inStock=" + inStock +
                ", price=" + price +
                ", quantity=" + quantity +
                ", itemNumber=" + itemNumber +
                '}';
    }
}
