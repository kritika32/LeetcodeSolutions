class Solution {
    public int mostFrequent(int[] nums, int key) {
        int arr[] = new int[1001];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key)arr[nums[i+1]]++;
        }
        
        
        int maxAns = 0;
        int maxCnt =0;
        
        for(int i=0;i<=1000;i++){
            if(arr[i]!=0){
                if(maxCnt<arr[i]){
                    maxCnt = arr[i];
                    maxAns = i;
                }
            }
        }
        return maxAns;
    }
}