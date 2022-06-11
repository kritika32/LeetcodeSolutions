class Solution {
    public int minMaxGame(int[] nums) {
    Queue<Integer> q = new LinkedList<>();
    
        for(int n : nums){
            q.offer(n);
        }
        boolean flag = true;
        while(q.size()>1){
            
            if(flag){
                q.offer(Math.min(q.poll(),q.poll()));
            }else{
               q.offer(Math.max(q.poll(),q.poll())); 
            }
            
            flag = !flag;
        }
        
        return q.poll();
    }
}