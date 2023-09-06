class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length < 2)
            return nums.length;
        
        int counter = 0;
        int kIdx = 1;
        int prevNum = nums[0];
        
        while (counter < nums.length) {
            if (nums[counter] != prevNum) {
                nums[kIdx] = nums[counter];
                prevNum = nums[counter];
                kIdx+=1;
            }
            
            
            counter+=1;
        }
        
        return kIdx;
    }
}