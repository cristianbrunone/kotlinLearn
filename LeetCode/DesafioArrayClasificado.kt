fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var i = m - 1  
    var j = n - 1  
    var k = m + n - 1  

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }

    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3

    merge(nums1, m, nums2, n)
    println(nums1.joinToString())  

    val nums1b = intArrayOf(1)
    val nums2b = intArrayOf()
    merge(nums1b, 1, nums2b, 0)
    println(nums1b.joinToString())  

    val nums1c = intArrayOf(0)
    val nums2c = intArrayOf(1)
    merge(nums1c, 0, nums2c, 1)
    println(nums1c.joinToString())  
}
