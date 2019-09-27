package basic;

import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args){
        int[] arr={90,54,67,47,89,46,56};
        for(int i=1;i<arr.length;i++){
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序已经有序，排序已经完成
            boolean flag=true;

            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
