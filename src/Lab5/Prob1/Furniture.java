package Lab5.Prob1;

public class Furniture extends Product {
    String material;
    double shippingCost;

    public Furniture(String material, double ShippingCost) {
        this.material = material;
        this.shippingCost = ShippingCost;
    }

    @Override
    public double getPrice()
    {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString()
    {
        return String.format("Product Name : %s\nOriginal Price : %f\nMaterial : %s\nShipping Cost : %f\nPrice(+Shipping Cost) : %f",super.getProductName(),super.getPrice(),material,shippingCost,this.getPrice());
    }
}
