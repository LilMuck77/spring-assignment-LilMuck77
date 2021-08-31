package edu.wctc.springassignment;

import edu.wctc.springassignment.iface.SalesInput;
import edu.wctc.springassignment.iface.SalesReport;
import edu.wctc.springassignment.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportGenerator {

    private SalesInput salesInput;

    private SalesReport salesReport;

    private ShippingPolicy shippingPolicy;

    private List<Sale> allSales = new ArrayList<Sale>();

    public ReportGenerator(){
        System.out.println("Generating Report...");
    }

    @Autowired
    public void setSalesInput(SalesInput salesInput){
        this.salesInput = salesInput;
    }

    @Autowired
    public void setSalesReport(SalesReport salesReport){
        this.salesReport = salesReport;
    }
    @Autowired
    public void setShippingPolicy(ShippingPolicy shippingPolicy){
        this.shippingPolicy = shippingPolicy;
    }

    public void generateSales(){
        allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            aSale.setShippingPolicy(shippingPolicy.getShippingCost(aSale));
        salesReport.generateReport(allSales);
    }

}

