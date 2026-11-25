class Solution {
    public int trap(int[] height) {

        int[] leftMax = getLeftMax(height);
        int[] rightMax = getRightMax(height);

        int water = 0;

        for(int i = 0; i < height.length; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    public int[] getLeftMax(int[] h) {
        int[] leftMax = new int[h.length];

        leftMax[0] = h[0];

        for(int i = 1; i < h.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], h[i]);
        }

        return leftMax;
    }

    public int[] getRightMax(int[] h) {
        int[] rightMax = new int[h.length];

        int n = h.length - 1;
        rightMax[n] = h[n];

        for(int i = n - 1; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], h[i]);
        }

        return rightMax;
    }
}