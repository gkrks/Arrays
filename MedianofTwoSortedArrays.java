class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length == 1 && nums2.length==1) return (double)(nums1[0]+nums2[0])/2;
        
        int n = nums1.length + nums2.length;
        int[] num = new int[n];
        
        System.arraycopy(nums1, 0, num, 0, nums1.length);
        System.arraycopy(nums2, 0, num, nums1.length, nums2.length);
        
        Arrays.sort(num);
        
        return n%2 == 0 ? (double)(num[(n-1)/2]+num[n/2])/2 : (double) num[n/2];
        
        
    }
}
