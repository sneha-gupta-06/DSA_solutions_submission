class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;

        Set<List<Integer>> s = new HashSet<>();

      
        for (int i = 0; i <n-2; i++ ){
            for (int j = i+1; j<n-1; j++ ){
                for (int k = j +1; k <n; k++){
                    if (nums[i] +nums[j] + nums[k] ==0){
                        List<Integer>  li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        Collections.sort(li);
                           s.add(li);
                    }
                 
                }
            }
            
        }
      List<List<Integer>> ans = new ArrayList<>(s);
        return ans;
    }
}
