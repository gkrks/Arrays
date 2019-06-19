class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int[] res = new int[2];
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i  = 0; i < n; i++){
            map.put(i, nums[i]);
        }
        for(int i = 0; i <  n; i++){
            if(map.containsValue(target - nums[i]) && (target-nums[i] != nums[i])){
                res[0] = i;
                res[1] = getKeyByValue(map, target-nums[i]);
            }
        }
        
        return res;
    }
    
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
    for (Entry<T, E> entry : map.entrySet()) {
        if (Objects.equals(value, entry.getValue())) {
            return entry.getKey();
        }
    }
    return null;
    }
}
