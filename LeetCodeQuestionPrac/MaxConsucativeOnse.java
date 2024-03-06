package LeetCodeQuestionPrac;
public class MaxConsucativeOnse {
    
        public int findMaxConsecutiveOnes(int[] nums) {
            
            
            int maxConsecutiveOnes = 0;
            int currentConsecutiveOnes = 0;
    
            for (int num : nums) {
                if (num == 1) {
                    currentConsecutiveOnes++;
                    maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
                } else {
                    currentConsecutiveOnes = 0; 
                }
            }
    
            return maxConsecutiveOnes;
        }
    
        public static void main(String[] args) {

            MaxConsucativeOnse mc = new MaxConsucativeOnse();
            
            
            int[] nums1 = {1, 1, 0, 1, 1, 1};
            int result1 = mc.findMaxConsecutiveOnes(nums1);
            System.out.println(result1);
    
            int[] nums2 = {1, 0, 1, 1, 0, 1};
            int result2 = mc.findMaxConsecutiveOnes(nums2);
            System.out.println(result2);
        }
    }
    
            
            
        
    

