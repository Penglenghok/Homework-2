package Problem4;

public class Pizza {
    public PizzaSize size;
    public PizzaType type;
    public int qty;

    public Pizza(PizzaSize size, PizzaType type, int qty) {
        this.size = size;
        this.type = type;
        this.qty = qty;
    }

    public double calculatePrice(){
        double sizePrice = switch (size){
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };

        double typePrice = switch (type){
            case VEGGIE -> 1;
            case PEPPERONI, BBQ_CHICKEN -> 2;
            case CHEEZE -> 1.5;
        };

        return (sizePrice + typePrice) * qty;
    }

    public String printOrderSummary(){
        double price = calculatePrice();
        double tax = price * 0.03;
        double total = price + tax;

        return "Pizza Order: \nSize: %s\nType: %s\nQty: %d\nPrice: $%s\nTax: $%s\nTotal Price: %s".formatted(size.name(), type.name(), qty, price, tax, total);
    }
}
