class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int k = 0; k < nums.length - 2; k++) {

            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {

                int sum = nums[k] + nums[i] + nums[j];

                int diff = sum - target;
                int closestDiff = closest - target;

                if (diff < 0) diff = -diff;
                if (closestDiff < 0) closestDiff = -closestDiff;

                if (diff < closestDiff) {
                    closest = sum;
                }

                if (sum == target) {
                    return sum;
                }

                if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return closest;
    }
}