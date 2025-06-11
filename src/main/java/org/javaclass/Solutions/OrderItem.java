package org.javaclass.Solutions;

//!                             Alter the isInStock method to check quantity before
//!                             returning it's value.
//!                             If quantity is < 1 return false

class OrderItem {
    boolean inStock = true;
    double price = 45.50;
    int quantity = 0;
    long itemNumber = 83454544456794366L;

    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem();
        System.out.println(orderItem.isInStock());
    }

    public boolean isInStock() {
        if(quantity < 1){
            this.inStock = false;
        }
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
