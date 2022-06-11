class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i: nums){
            max = Math.max(i,max);
        }
        
        int arr[] = new int[max+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        
        for(int i=0;i<=max;i++){
            if(arr[i]%2!=0)return false;
        }
        
        return true;
    }
}