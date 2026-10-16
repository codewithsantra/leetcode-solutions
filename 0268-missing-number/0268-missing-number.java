class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int  i = 0;

        while(i < n)
        {
            if(nums[i] < n && nums[i] != i)
            {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
            else i++;
        }

        for(int j =0; j<n; j++)
        {
            if(nums[j] != j) return j;
        }
        
        return nums.length;
    }
}