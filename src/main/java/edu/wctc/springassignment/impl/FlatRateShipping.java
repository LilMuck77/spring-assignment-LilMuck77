package edu.wctc.springassignment.impl;


import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {

        return 1.5;
    }

}
