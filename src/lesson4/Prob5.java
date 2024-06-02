package lesson4;

public class Prob5 {
    public static void main(String[] args) {
        int[] n = {5, -3, 6, 1, 9, 4};
        System.out.println(findMax(n, 0));
    }

    private static int findMax(int[] nums, int i){
        if (i == nums.length - 1){
            return nums[i];
        }

        int maxInRest = findMax(nums, i + 1);
        return Math.max(nums[i], maxInRest);
    }
}
