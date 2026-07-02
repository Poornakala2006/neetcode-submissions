class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;
        int max = 0;
        while(left < right)
        {
            int width = right - left;
            int h1 = Math.min(heights[left] , heights[right]);
            int area = width*h1;
            max = Math.max(max , area);
            if(heights[left] < heights[right])
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return max;
        
    }
}
