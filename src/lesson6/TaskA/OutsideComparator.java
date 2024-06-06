package lesson6.TaskA;

import java.util.Comparator;

public class OutsideComparator implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee o1, DeptEmployee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
