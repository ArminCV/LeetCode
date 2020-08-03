class Solution {
    public int findNumbers(int[] nums) {
        int ctr = 0, i = 0;
        //  loop the array
        int[] num_counter = new int[nums.length];
        for(int num : nums){
            do{
                num /= 10;
                num_counter[i]++;
            }while(num != 0);
            i++;
        }
        //  check if num_counter array if even
        for(int num : num_counter){
            if((num%2) == 0){
                ctr++;
            }
        }
        return ctr;
    }
}