public class Solution {
    int ans = 0;
    public String solve(String A, int B) {
        StringBuilder sb = new StringBuilder(A);
        
         find(sb,B);
         return String.valueOf(ans);
        
    }
    public void find(StringBuilder A,int k){
        if(k==0){
            int res = Integer.valueOf(A.toString());
            if(ans<res)ans=res;
            return ;
        }
        
        for(int i=0;i<A.length();i++){
            for(int j=i+1;j<A.length();j++){
               swap(A,i,j);
               find(A,k-1);
               swap(A,i,j);
            }
        }
    }
    
    public void swap(StringBuilder A,int i,int j){
        
        char temp = A.charAt(i);
        A.setCharAt(i,A.charAt(j));
        A.setCharAt(j,temp);
    }
}
