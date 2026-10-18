class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product= 1;
        boolean containsZero = false;
        int countSum = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] != 0)
                product *= nums[i];
            if (nums[i] == 0){
                containsZero = true;
                countSum++;
            }      
        }

        if(countSum == nums.length){
            return nums;
        }else if(countSum > 1){
            return new int[nums.length];
        }
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0)
                nums[i] = product;
            else if(containsZero)
                nums[i] = 0;
            else    
                nums[i] = product/nums[i];
        }

        return nums;
    }
}  
