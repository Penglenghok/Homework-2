package lesson4;

import java.util.Arrays;

public class Prob3 {
    public static void main(String[] args) {
        int[] n = {9, 10, 1, 6, 3, 11, 2, 18};
        System.out.println(Arrays.toString(reverse(n, 0)));
    }

    private static int[] reverse(int[] nums, int i) {
        int index = i;
        int n = nums.length;
        int maxIndex = i;
        if (i < n - 1){
            while (index < n - 1) {
                if (nums[index + 1] > nums[maxIndex]) {
                    maxIndex = index + 1;
                }

                index++;
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;

            return reverse(nums, i + 1);
        }
        return nums;
    }
}
