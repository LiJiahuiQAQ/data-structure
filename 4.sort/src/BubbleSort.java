/**
 * @program: data-structure
 * @description: 冒泡排序
 * @author: Li Jiahui
 * @create: 2018-12-15 10:12
 **/
public class BubbleSort {


    /**
    * @Description: 冒泡排序:时间复杂度O(n^2)
    * @Param: [array]
    * @return: void
    * @Author: Li Jiahui
    * @Date: 2018/12/15
    */
    public static void  sort(int []array){

        for(int i=0;i<array.length;i++){
            for (int j=i;j<array.length-1;j++) {
                if (array[i] > array[j]){
                    int num=array[i];
                    array[i]=array[j];
                    array[j]=num;
                }
            }
        }



    }



}
