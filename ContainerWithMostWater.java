class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0) return 0;
        
        int max = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left < right){
            if(height[left] < height[right]){
                max = Math.max(max, (right-left)*height[left]);
                left++;
            }
            else{
                max = Math.max(max, (right-left)*height[right]);
                right--;
            }
        }
        return max;
    }
}
