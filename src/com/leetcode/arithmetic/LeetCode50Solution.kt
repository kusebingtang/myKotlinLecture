package com.leetcode.arithmetic

/**
 * https://leetcode-cn.com/problems/powx-n/
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。

示例 1:

输入: 2.00000, 10
输出: 1024.00000

示例 2:

输入: 2.10000, 3
输出: 9.26100

示例 3:

输入: 2.00000, -2
输出: 0.25000
解释: 2-2 = 1/22 = 1/4 = 0.25

 */
class LeetCode50Solution {

    fun myPow(x: Double, n: Int): Double {

        if(n==0){
            return  1.0
        }

        if(n==1){
            return  x
        }

        if(n==-2147483648){//n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1]

        }


        var t = myPow(x, Math.abs(n/2) )
        if (n % 2 == 0)
        {
            var temp = t * t
            t = temp
        }
        else
        {
            var temp = x * t * t
            t =  temp
        }

        if (n < 0)
        {
            return 1.0  /t
        }
        return t
    }

    fun myPowNonRecursion(x: Double, n: Int): Double {

        var powValue = 1.0
        var xValue=x

        var i = n
        while (i != 0) {
            if (i % 2 != 0) {
                powValue *= xValue
            }
            xValue *= xValue
            i /= 2
        }
        return if (n < 0) 1 / powValue else powValue
    }

}

fun  main() {
    var solution = LeetCode50Solution()
    println(solution.myPow(2.0,9))
    println(solution.myPow(2.0,10))
    println(solution.myPow(2.0, -2147483648))
//    println(solution.myPowNonRecursion(2.0, 9))
}
