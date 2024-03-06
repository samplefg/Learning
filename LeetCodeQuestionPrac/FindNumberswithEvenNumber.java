package LeetCodeQuestionPrac;

public class FindNumberswithEvenNumber {
    public static void main(String[]args){
        int arr[] = {12,345,2,6,7896};
        FindNumberswithEvenNumber fen = new FindNumberswithEvenNumber();
        int result = fen.findNumbers(arr);
        System.out.println(result);
    }
    public int findNumbers(int[] nums) {
        
        int result = 0;
        

        for(int i = 0; i < nums.length; i++){
            int digit = 0;
            while(nums[i] > 0){
                digit++;
                nums[i]/= 10;
            }
            
            if(digit % 2 == 0){
                result++;
            }
        }
        return result;
    }
}
