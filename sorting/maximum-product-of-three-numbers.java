class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        int thrdMax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;

        for(int ele:nums){
            if(ele>max){
            thrdMax=secMax;
             secMax=max;
              max=ele;
              }
            else if(ele>secMax){
                thrdMax=secMax;
                secMax=ele;
                }
            else if(ele>thrdMax){
                thrdMax=ele;
                }

            if(ele<min){
                secMin=min;
                min=ele;
            }
            else if(ele<=secMin ){
                secMin=ele;
            }
        }
            int mul=max*secMax*thrdMax;
            int mul1=min*secMin*max;
            if(mul>mul1){
                return mul;
            }
              return mul1;  
    }
}