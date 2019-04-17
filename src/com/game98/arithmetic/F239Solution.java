package com.game98.arithmetic;
import java.util.*;

/**
 *  https://leetcode-cn.com/problems/sliding-window-maximum/
 *
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口 k 内的数字。滑动窗口每次只向右移动一位。
 *
 * 返回滑动窗口最大值。
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 注意：
 *
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 输入数组的大小，且输入数组不为空
 */
public class F239Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int numLen = nums.length;
        if(nums == null || numLen<k || k<=0){
            return nums;
        }
        int[] res = new int[numLen-k+1];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->nums[b]-nums[a]);

        for(int i=0;i<k-1;i++){
            maxHeap.offer(i);
        }
        for(int i=k-1;i<numLen;i++){
            maxHeap.offer(i);
            while(maxHeap.peek()<i-(k-1)){
                maxHeap.poll();
            }
            res[i-(k-1)] = nums[maxHeap.peek()];
        }
        return res;
    }


    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k) {
            return new int[0];
        }
        //双端队列存储nums中的index
        LinkedList<Integer> deque = new LinkedList<>();
        int n = nums.length;
        int index = 0;
        //结果数组
        int[] resArr = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            //当deque不为空，且deque的尾部索引对应的值小于等于外面来的值，将尾部的索引弹出
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            //在deque尾部添加索引
            deque.addLast(i);
            //判断deque的头部索引是否过期 k是滑动窗口的size,当deque的头部索引等于i-k时，表明索引过期弹出
            //当然存在一种情况是deque的尾部进来的新索引将老的索引挤出去的场景
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            //当i 至少为（k-1）的时候，表示最大滑动窗口开始形成，开始收集resArr
            if (i >= k - 1) {
                resArr[index++] = nums[deque.peekFirst()];
            }
        }
        return resArr;
    }






    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};

        F239Solution solution = new F239Solution();
        int[] results = solution.maxSlidingWindow(arr,3);

        System.out.println(Arrays.toString(results));

        results = solution.maxSlidingWindow2(arr,3);
        System.out.println(Arrays.toString(results));
    }


}
