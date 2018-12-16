package com.dazzle.search;

/**
 * @program: data-structure
 * @description: 二分法查找
 * @author: Li Jiahui
 * @create: 2018-12-15 09:35
 **/

public class BinarySearch {

    /** 
    * @Description: 程序入口 
    * @Param: [value, array] 
    * @return: java.lang.Integer 
    * @Author: Li Jiahui
    * @Date: 2018/12/15 
    */ 
    public static Integer binarySearch(int value,int [] array){

        return binarySearch(value,array,0,array.length-1);

    }

    /** 
    * @Description: 递归返回正确的位置 
    * @Param: [value, array, low, high] 
    * @return: java.lang.Integer 
    * @Author: Li Jiahui
    * @Date: 2018/12/15 
    */ 
    public static Integer binarySearch(int value,int [] array,int low,int high){

        //程序出口
        if(low>high){
            return null;
        }

        int middle=(low+high)/2;

        if(array[middle]>value){
            return binarySearch(value,array,low,middle);
        }else if(array[middle]<value){
            return binarySearch(value,array,middle,high);
        }else {
            return middle;
        }


    }

    /** 
    * @Description: main 
    * @Param: [args] 
    * @return: void 
    * @Author: Li Jiahui
    * @Date: 2018/12/15 
    */ 
    public static void main(String args[]){
        int a[]={1,3,4,5,6,7,8,9};
        System.out.println(binarySearch(3,a));
    }

}



