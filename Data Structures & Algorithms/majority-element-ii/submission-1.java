class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
       Map<Integer, Integer> hm = new HashMap<>();

       List<Integer> res = new ArrayList<>();
       int n = (nums.length /3) +1;
       
        for (int num: nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if (entry.getValue() >= n){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}