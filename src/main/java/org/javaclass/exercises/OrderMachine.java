package org.javaclass.exercises;

import org.javaclass.Solutions.OrderItem;
public class OrderMachine {


    public static void main(String[] args) {
        OrderItem socks = new OrderItem();
        socks.setItemName("socks");
        socks.setQuantity(0);

        OrderMachine orderMachine = new OrderMachine();
        orderMachine.autoOrder(socks);
    }

    void autoOrder(OrderItem orderItem){
        if(orderItem.getQuantity() < 1){
            System.out.println(orderItem.getItemName() + " is out of stock ");
        }

        if(orderItem.getQuantity() <= 5){
            System.out.println("Auto ordering more of " + orderItem.getItemName());
        }

    }


}
