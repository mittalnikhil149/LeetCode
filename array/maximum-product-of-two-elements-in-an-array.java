class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int Secondmax=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                Secondmax=max;
                max=nums[i];
            }     
            else if(nums[i]>=Secondmax){
                Secondmax=nums[i];
            }
    }
    
    return (max-1)*(Secondmax-1);
    // Arrays.sort(nums);
    // int max1=nums[nums.length-1];
    // int max2=nums[nums.length-2];
    // return (max1-1)*(max2-1);
    }
}