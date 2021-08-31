package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.ShippingPolicy;

public class FreeShippingOver100 implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
       // if(sale > 100)
        int shippingCost = 0;
        return shippingCost;
    }
}
