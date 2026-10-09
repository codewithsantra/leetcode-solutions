class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] found = new boolean[nums.length + 1];

        for (int num : nums) {
            found[num] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!found[i]) {
                result.add(i);
            }
        }

        return result;

    }
}