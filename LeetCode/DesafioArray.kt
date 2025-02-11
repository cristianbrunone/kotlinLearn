/*Dado um array binário nums, retorne o número máximo de 1s consecutivos no array.*/

fun findMaxConsecutiveOnes(nums : IntArray): Int {
    var maxcount = 0
    var currentCount = 0

    for (num in nums) {
        if(num == 1) {
            currentCount++
            maxCount = maxOf(maxCount, currentCount)
        } else {
            currentCount = 0
        }
    }

    return maxCount
}