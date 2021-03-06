package question;

import java.util.Arrays;

public class No031 {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1){
            return;
        }
        for(int i=nums.length-1;i>0;--i){
            if(nums[i]>nums[i-1]){
                for(int j=nums.length-1;j>=i;--j){
                    if(nums[j]>nums[i-1]){
                        int temp=nums[j];
                        nums[j]=nums[i-1];
                        nums[i-1]=temp;
                        Arrays.sort(nums, i, nums.length);
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
    }
}
