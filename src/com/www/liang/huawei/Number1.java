
package com.www.liang.huawei;
import java.util.HashSet;

/**
 * @author Langwo
 */
public class Number1 {
    public static void main(String[] args) {
        //消除重复数组，并且返回消除后的数组长度
//        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = new int[]{1,1,2};
        int number = removeDuplicates(nums);
        System.out.println("去重后的数组长度为：" + number);
    }

//    private static int removeDuplicates(int[] nums) {
//        //hashset有去重的方法,只是去重nums[]数据元素不对
//        HashSet<Object> set = new HashSet<>(10);
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        System.out.println(set);
//        return set.size();
//    }

    /**
     * 去除数组中的重复元素，并且返回新的数组长度
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow=1;
        for (int fast = 1; fast <= nums.length - 1; fast++) {
            if (nums[fast]!=nums[fast-1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
