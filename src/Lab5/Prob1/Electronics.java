package Lab5.Prob1;

public class Electronics extends Product {
    short warranty;
    double warrantyCost;

    public Electronics(short warranty, double warrantyCost)
    {
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice()
    {
        return super.getPrice()+warrantyCost;
    }

    @Override
    public String toString()
    {
        return String.format("Product Name : %s\nOriginal Price : %f\nWarranty(in months) : %d\nWarranty Cost : %f\nPrice(+Warranty Cost) : %f",super.getProductName(),super.getPrice(),warranty,warrantyCost,this.getPrice());
    }
}
