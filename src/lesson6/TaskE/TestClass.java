package lesson6.TaskE;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    public static void main(String[] args) {
        DeptEmployee[] collections= DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(collections));
        Arrays.sort(collections, (o1, o2) -> o1.getHireDate().compareTo(o2.getHireDate()));
        System.out.println(Arrays.toString(collections));
    }
}
