package Problem1;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("John","Cena","1122334455");
        Address b1 = new Address("North street","Fairfield","Iowa","52556");
        Address s1 = new Address("North street","Fairfield","Iowa","52556");
        c1.setBillingAddressadd(b1);
        c1.setShippingAddress(s1);

        Customer c2 = new Customer("James","Bond","22222233333");
        Address b2 = new Address("South street","Chicago","Illinois","60007");
        Address s2 = new Address("South street","Chicago","Illinois","60007");
        c2.setBillingAddressadd(b2);
        c2.setShippingAddress(s2);

        Customer c3 = new Customer("Justin","Beaver","44444455555");
        Address b3 = new Address("East street","Seattle","Washington","98001");
        Address s3 = new Address("East street","Seattle","Washington","98001");
        c3.setBillingAddressadd(b3);
        c3.setShippingAddress(s3);

        Customer[] customers = {c1,c2,c3};

        for (Customer c:customers){
            if(c.getBillingAddress().getCity()=="Chicago"){
                System.out.println(c.toString());
            }
        }

    }
}