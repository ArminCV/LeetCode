class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer[]
     */
    function runningSum($nums) {
        $runSum = array();
        $currentSum = 0;
        for($i = 0; $i < count($nums); $i++){
            $currentSum += $nums[$i];
            $runSum[$i] = $currentSum;
        }
        return $runSum;
    }//function end
    
}