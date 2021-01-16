package com.study_oct31;

import java.util.Random;
//随机工具类
public class RandomUtil {
    private Random rand=new Random();
    public int nextInt(int...nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("NULL !");
        }
        //生成1到nums[0]包括1和num[0]之间的随机数
        if (nums.length == 1) return rand.nextInt(nums[0]) + 1;
        //生成nums[0]到nums[1]包括num[0]和nums[1]之间的随机数
        if (nums.length == 2) return rand.nextInt(nums[1] + 1 - nums[0]) + nums[0];
        //从数组nums中取出一个随机元素
        return nums[rand.nextInt(nums.length)];
    }
}
