package LeetCodeQuestionPrac;

import java.util.Arrays;

public class SquaresofSortedArray {
    public static int[] sortedSquares(int[] nums) { 
        int n = nums.length;
        int[] result = new int[n];

        int head = 0;
        int tail = n - 1;
        int pos = n - 1;

        while (head <= tail) {
            int headSquare = nums[head] * nums[head];
            int tailSquare = nums[tail] * nums[tail];

            if (headSquare > tailSquare) {
                result[pos--] = headSquare;
                head++;
            } else {
                result[pos--] = tailSquare;
                tail--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = sortedSquares(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(result1));

        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = sortedSquares(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + Arrays.toString(result2));
    }
    
    
}
