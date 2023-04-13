package com.wsl.algorithm.binarySerch;


public class BinarySearch {
    /*二分查找基础版
     * params： a-待查找的升序数组
     *          target -待查找的目标值
     *
     * returns:
     *       找到则返回索引
     *       找不到返回-1
     * */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            //范围内还有东西
            int m = (i + j) / 2;
            if(target<a[m]){
                j=m-1;
            }else if(a[m]<target){
                i=m+1;
            }else {
                return m;
            }
        }
        return -1;
    }

}
