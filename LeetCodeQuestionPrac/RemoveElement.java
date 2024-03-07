package LeetCodeQuestionPrac;

public class RemoveElement {
    public static void main(String[]args){
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement re = new RemoveElement();
        int num = re.removeElement(arr, val);
        System.out.println(num);
    }
    public int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] != val){
            nums[k] = nums[i];
            k++; 
           }
        }
        return k++;
    }
}
