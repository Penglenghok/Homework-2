package lesson6.TaskA;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        DeptEmployee[] collections=DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(collections));
        Arrays.sort(collections, new OutsideComparator());
        System.out.println(Arrays.toString(collections));
    }
}
