package st;

import java.util.Arrays;
public class ArraysTest {
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currMax = 0;

        for (int num : nums) {
            currMax = Math.max(num, currMax + num);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static int[] findMaxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currMax = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            if (currMax > maxSoFar) {
                maxSoFar = currMax;
                start = i - currMax + 1; // 更新子数组的起始位置
                end = i; // 更新子数组的结束位置
            }
        }

        int[] maxSubArray = new int[end - start + 1];
        System.arraycopy(nums, start, maxSubArray, 0, maxSubArray.length);
        return maxSubArray;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 8, 1, -5, 4};
        int maxSum = maxSubArraySum(nums);
        System.out.println("Maximum contiguous sum is " + maxSum);

        int[] maxSubArray = findMaxSubArray(nums);
        System.out.println("Maximum contiguous subarray is " + Arrays.toString(maxSubArray));
    }
}