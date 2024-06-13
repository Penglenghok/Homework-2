package lesson8.Problem3;
 ;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Marketing mk1 = new Marketing("John", "Pen", 2.2);
        Marketing mk2 = new Marketing("Jame", "Pork", 1900.2);
        Marketing mk3 = new Marketing("Jim", "Pencil", 6.2);
        Marketing mk4 = new Marketing("Joe", "Paper", 10.2);
        Marketing mk5 = new Marketing("Jane", "Popcorn", 62.2);
        ArrayList<Marketing> marketings = new ArrayList<Marketing>();
        marketings
                .add(mk1);
        marketings
                .add(mk2);
        marketings
                .add(mk3);
        marketings
                .add(mk4);
        marketings
                .add(mk5);
        System.out.println(marketings
                .get(2));
        Marketing mk6 = new Marketing("Jarvis", "Suit", 1620.2);
        marketings
                .set(2, mk6);
        System.out.println(marketings
                .get(2));
        System.out.println(marketings
        );
        Collections.sort(marketings
                , new Comparator<Marketing>() {
                    @Override
                    public int compare(Marketing o1, Marketing o2) {
                        if (Double.compare(o1.getSalesamount(), o2.getSalesamount()) != 0) {
                            return Double.compare(o1.getSalesamount(), o2.getSalesamount());
                        } else if (o1.getEmployeename().compareTo(o2.getEmployeename()) != 0) {
                            return o1.getEmployeename().compareTo(o2.getEmployeename());
                        } else {
                            return o1.getProductname().compareTo(o2.getProductname());
                        }
                    }
                });

        List<Marketing> topSales = listMoreThan1000(marketings);

        Collections.sort(topSales, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                if (Double.compare(o1.getSalesamount(), o2.getSalesamount()) != 0) {
                    return Double.compare(o1.getSalesamount(), o2.getSalesamount());
                } else if (o1.getEmployeename().compareTo(o2.getEmployeename()) != 0) {
                    return o1.getEmployeename().compareTo(o2.getEmployeename());
                } else {
                    return o1.getProductname().compareTo(o2.getProductname());
                }
            }
        });

        System.out.println(topSales);


    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> newList = new ArrayList<Marketing>();
        for (Marketing mk : list) {
            if (mk.getSalesamount() > 1000) {
                newList.add(mk);
            }
        }
        return newList;
    }
}
