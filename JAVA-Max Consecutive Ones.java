class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        //  find number of 0's in the given string of numbers
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                cons++;
            }
        }
        //  array length is cons+1
        int[] cons_num = new int[cons+1];
        int i = 0;
        //  loop and 
        for(int num: nums){
            if(num == 1){
                cons_num[i] += 1;
            }
            else{
                i++;
            }
        }
        //  find the max number of consecutive ones
        int max = cons_num[0];
        for(int num: cons_num){
            if(num > max){
                max = num;
            }
        }
        //  return the max consecutive
        return max;
    }
}