class Solution {
    public void moveZeroes(int[] nums) {
         int i =0;
         int temp = 0;

         while(i < nums.length)
         {
            if(nums[i] != 0)
            {
            int val = nums[i];
            nums[i] = nums[temp];
            nums[temp] = val;

            temp++;
            }

            i++;
         }
         
    }
}