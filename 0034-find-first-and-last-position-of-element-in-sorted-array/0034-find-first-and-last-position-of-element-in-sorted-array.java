class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = Occurance(nums, target, true);
        int last = Occurance(nums, target, false);

        return new int[]{first,last};
    }

    public int Occurance(int[] nums, int target, boolean firstIndex)
    {
        int ans =-1;
        int start =0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(nums[mid] > target)
            {
                end = mid -1;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else {
                ans = mid;
                if(firstIndex) end = mid -1;
                else start = mid +1;
            }
        }

        return ans;
    }
}