package edu.wctc.springassignment.iface;

import edu.wctc.springassignment.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}




