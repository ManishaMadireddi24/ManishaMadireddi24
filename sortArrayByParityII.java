class sortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int res[]= new int[n];
        int index=0;
        for(int m:nums)
        {
            if(m%2==0)
            {
                res[index]=m;
                index=index+2;
            }
        }
        index=1;
        for(int m:nums)
        {
            if(m%2==1)
            {
                res[index]=m;
                index=index+2;
            }
        }
         return res;                 
        
    }
}