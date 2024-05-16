class Solution {
    fun numberOfSteps(num: Int): Int {
        var count = 0
        var runningNum = num
        while(runningNum > 0){
            if (runningNum % 2 == 0) runningNum /= 2
            else runningNum -= 1
            count += 1
        }
        return count
    }
}