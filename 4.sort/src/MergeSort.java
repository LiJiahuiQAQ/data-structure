/**
 * @program: data-structure
 * @description: 归并排序 时间复杂度O（nlogn）
 * @author: Li Jiahui
 * @create: 2018-12-15 10:20
 **/
public class MergeSort {

    /** 
    * @Description: 主函数，测试用 
    * @Param: [args] 
    * @return: void 
    * @Author: Li Jiahui
    * @Date: 2018/12/16 
    */
    public static void main(String args[]){

       int [] array={4,5,7,4,2,6};
       sort(array);
       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
       }

    }

    /** 
    * @Description: 程序入口，排序方法通用类 
    * @Param: [array] 
    * @return: void 
    * @Author: Li Jiahui
    * @Date: 2018/12/16 
    */ 
    public static void sort(int array[]){

        mergeSort(array,0,array.length-1);

    }

    /** 
    * @Description: 递归函数 
    * @Param: [array, low, high] 
    * @return: void 
    * @Author: Li Jiahui
    * @Date: 2018/12/16 
    */ 
    public static void mergeSort(int array[],int low,int high){

        int middle=(low+high)/2;
        if(low<high){
           mergeSort(array,low,middle);
           mergeSort(array,middle+1,high);
           merge(array,low,middle+1,high);
        }

    }

    /** 
    * @Description: 排序函数 
    * @Param: [array, low, middle, high] 
    * @return: void 
    * @Author: Li Jiahui
    * @Date: 2018/12/16 
    */ 
    public static void merge(int array[],int low ,int middle,int high){

        int [] help=new int [array.length];
        for(int i=0;i<array.length;i++){
            help[i]=array[i];
        }

        int left=low;
        int right=middle;
        int current=low;
        while(left<=middle&&right<=high){
            if(help[left]<=help[right]){
                array[current++]=help[left++];
            }
            else {
                array[current++]=help[right++];
            }
        }

        int remain=middle-left;
        for(int i=0;i<remain;i++){
            array[current++]=help[left++];
        }
    }
}
