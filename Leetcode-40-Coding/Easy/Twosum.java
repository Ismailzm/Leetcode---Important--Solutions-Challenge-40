class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int required=target-current;
            if(hs.containsKey(required)){
                return new int[]{hs.get(required),i};
            }
            hs.put(current,i);
        }
        return new int[]{};
    }
}
