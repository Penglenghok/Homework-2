package lesson6.TaskB;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        DeptEmployee[] collections= DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(collections));
        Arrays.sort(collections, new DeptEmployee().getNameComparator());
        System.out.println(Arrays.toString(collections));
    }
}
