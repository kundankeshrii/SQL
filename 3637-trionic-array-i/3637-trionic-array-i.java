class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n-1;i++){
             for(int j=i+1;j<n-1;j++){
                if(isIncreasing(nums,0,i) &&
                isDecreasing(nums,i,j) &&
                isIncreasing(nums,j,n-1)){
                    return true;
                }
             }
        }
        return false;
    }
    private boolean isIncreasing(int[] arr,int l, int r){
        for(int i=l;i<r;i++){
            if(arr[i]>=arr[i+1]) return false;
            }
        return true;
    }
    private boolean isDecreasing(int[] arr,int l, int r){
        for(int i=l;i<r;i++){
            if(arr[i]<=arr[i+1]) return false;
            }
        return true;
    }
}