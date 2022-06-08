class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
       if(nums==null)return res;
        
        int len = nums.length;
        if(len==0)return res;
        
        int arr[] = new int[1001];
        
        for(int ar[] : nums){
            for(int n : ar){
                arr[n]++;
            }
        }
        
        for(int i=1;i<1001;i++){
            if(arr[i]==len){
                res.add(i);
            }
        }
        return res;
    }
}