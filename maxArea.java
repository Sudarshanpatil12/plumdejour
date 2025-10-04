class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int width = right - left;
            int height1 = Math.min(height[left], height[right]);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            int area = width * height1;
            ans = Math.max(ans, area);

        }
        return ans;
    }
}
