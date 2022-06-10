class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> keyIdx = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key)
             keyIdx.add(i);
        }
        int c=0;
        for(int i=0;i<n;i++){
            int num = keyIdx.get(c);
            if(Math.abs(i-num)<=k){
                result.add(i);
            }
            if(i==num+k && c!=keyIdx.size()-1){
                c++;
            }
        }
        
        return result;
    }
}