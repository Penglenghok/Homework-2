package lesson6.TaskD;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    public static void main(String[] args) {
        DeptEmployee[] collections= DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(collections));
      Arrays.sort(collections,new Comparator<DeptEmployee>() {
          public int compare(DeptEmployee o1, DeptEmployee o2) {
              return o2.getName().compareTo(o1.getName());
          }
      });
        System.out.println(Arrays.toString(collections));
    }
}
