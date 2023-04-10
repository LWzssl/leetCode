package com.www.liang.huawei;

import java.util.Scanner;

/**
 * @author Langwo
 */
public class Number3 {
    public static void main(String[] args) {
        //旋转数组
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要旋转的位数");
        int anInt = scanner.nextInt();
        int[] newNums = rotate(nums, anInt);
        System.out.println("旋转后的数组为：" + newNums.toString());
    }

    private static int[] rotate(int[] nums, int k) {
//        1.先全部反转，将元素提到最前面
        int j = nums.length-1;
        int index = nums.length / 2;
        System.out.println(index);
        for (int i = 0; i < nums.length; i++) {
            if (i==index) {
                break;
            }else {
                nums[index] = nums[i];
                nums[i] = nums[j];
                nums[j] = nums[index];
                j--;
            }
        }
//        2.反转前半部分
//        3.反转后半部分
        return null;
    }
}
