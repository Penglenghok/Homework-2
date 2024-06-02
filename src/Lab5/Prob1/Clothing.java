package Lab5.Prob1;

public class Clothing extends Product{
    String brand;
    short discountPercentage;

    public Clothing(String brand, short discountPercentage)
    {
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice()
    {
        double price = super.getPrice();
        return price - price*discountPercentage/100;
    }

    @Override
    public String toString()
    {
        return String.format("Product Name : %s\nOriginal Price : %f\nBrand : %s\nDiscount Percentage : %d\nPrice(After Discount) : %f",super.getProductName(),super.getPrice(),brand,discountPercentage,this.getPrice());
    }
}
