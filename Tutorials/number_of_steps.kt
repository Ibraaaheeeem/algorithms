class Solution {
    fun numberOfSteps(num: Int): Int {
        var count = 0
        var runningNum = num
        while(runningNum > 0){
            // Change modulo and division operator to bitwise 'and' and 'rightshift'
            if (runningNum and 1 == 0) runningNum = runningNum shr 1
            else runningNum -= 1
            count += 1
        }
        return count
    }
}