class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1) return 0;
        int ans=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(j-i+1==k){
                    int min=Integer.MAX_VALUE;
                    int max=Integer.MIN_VALUE;
                    for(int x=i;x<=j;x++){
                        min=Math.min(min,nums[x]);
                        max=Math.max(max,nums[x]);
                    }
                    ans=Math.min(ans,max-min);
                }
            }
        }
        return ans;
    }
}
        