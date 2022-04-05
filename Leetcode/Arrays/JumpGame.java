package Leetcode.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1 ,1 , 4};
        System.out.println(ans(nums));
        ;
    }

    static boolean ans(int[] nums) {
        int n = nums.length;

        //last index from where we can reach to end cell
        //As from last index (n - 1) itself reach to  end cell,
        int lastIndex = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i + nums[i] >= lastIndex) {
                lastIndex = i;
            }
        }

        //check from 0 reach to end cell
        return lastIndex == 0;
    }


    private static boolean jump(int[] nums) {
        int last = nums.length - 1;
        int i = 0;
        while (i <= last) {
            if (nums[i] == 0) {
                return false;
            } else if (i == last) {
                return true;
            }
            i += nums[0];
        }

        return false;
    }
}
