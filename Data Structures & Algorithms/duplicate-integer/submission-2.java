class Solution {
    public boolean hasDuplicate(int[] nums) {
        
     /*   Set<Integer> set = new HashSet<Integer>();

        for (int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }

return nums.length == set.size()? false: true;

*/

HashMap<Integer, Integer> hm = new HashMap<>();

for (int i =0;i<nums.length; i++){
    hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    if (hm.get(nums[i]) > 1){
        return true;
    }
}

return false;
    }
}