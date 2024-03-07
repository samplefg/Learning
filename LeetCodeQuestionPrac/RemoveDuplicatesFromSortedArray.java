package LeetCodeQuestionPrac;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[]args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray rds = new RemoveDuplicatesFromSortedArray();
        int rdsa = rds.removeDuplicates(arr);
        System.out.println(rdsa);
    }
    public int removeDuplicates(int[] nums){
        int k = 1;
        int duplicate = nums[0];
        for(int i = 1; i < nums.length; i++){
           if(nums[i] != duplicate){
            duplicate = nums[i];
            nums[k] = duplicate;
            k++;
           }
        }
        return k;
    }
}
