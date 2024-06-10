package lesson6.TaskE;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    public static void main(String[] args) {
        String[] s = {"s1", "s2", "s3", "s4", "s5"};
        System.out.println(Arrays.toString(reverse(s, 0, s.length - 1)));
    }

    static String[] reverse(String[] s, int start, int end) {
        if (start > end) return s;

        String temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return reverse(s, start + 1, end - 1);
    }
}
