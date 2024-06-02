package Lab5.Prob1;

public class TestClass {
    public static void main(String[] args) {

        Product p1 = new Clothing("Nike",(short)1);
        p1.setProductName("Nike");
        p1.setPrice(100.0);

        Product p2 = new Electronics((short) 6,2.5);
        p2.setProductName("Rice Cooker");
        p2.setPrice(100.0);

        Product p3 = new Furniture("Plastic",8.3);
        p3.setProductName("Portable Chair");
        p3.setPrice(87.0);

        Product p4 = new Electronics((short) 3,4.3);
        p4.setProductName("Portable Heater");
        p4.setPrice(95.0);

        Product p5 = new Furniture("Wood",12.7);
        p5.setProductName("Table");
        p5.setPrice(206.45);

        Product[] products = new Product[5];
        products[0]=p1;
        products[1]=p2;
        products[2]=p3;
        products[3]=p4;
        products[4]=p5;

        for(Product p : products)
        {
            if(p != null)
            {
                System.out.println(p.toString());
                System.out.println("-----------");
            }
        }

        System.out.printf("Total Price : %f%n",sumProducts(products));
    }

    public static double sumProducts(Product[] products)
    {
        double sum = 0.0;
        for(Product p : products)
        {
            if(p != null)
            {
                sum += p.getPrice();
            }
        }

        return sum;
    }
}
