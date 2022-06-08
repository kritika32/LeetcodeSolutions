class Solution {
    public int findClosestNumber(int[] nums) {
        int diff = Integer.MAX_VALUE;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int nd = Math.abs(nums[i]);
                if(diff>nd){
                 diff = nd;
                 ans = nums[i];
                }
                
                if(diff==nd) ans = Math.max(ans,nums[i]);
            }
            else{
                if(diff>nums[i])
                {
                    diff = nums[i];
                    ans = nums[i];
                }
                 if(diff==nums[i]) ans = Math.max(ans,nums[i]);
            }
        }
        
        return ans;
    }
}