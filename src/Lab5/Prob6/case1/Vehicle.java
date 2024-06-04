package Lab5.Prob6.case1;

public class Vehicle {
    String type;
    int seat;

    public Vehicle(String car, int seat) {
        this.type = car;
        this.seat = seat;
    }


    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (!(ob instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) ob;
        return v.type.equals(type) && v.seat == seat;
    }
}
