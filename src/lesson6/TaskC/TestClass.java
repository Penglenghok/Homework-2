package lesson6.TaskC;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        DeptEmployee[] collections= DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(collections));
        new DeptEmployee().sort(collections);
        System.out.println(Arrays.toString(collections));
    }
}
