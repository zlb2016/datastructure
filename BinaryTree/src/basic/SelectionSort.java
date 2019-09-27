package basic;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr={2,4,3,6,5};
        //总共要经过N-1轮比较
        for(int i=0;i<arr.length;i++){
            int min=i;
            //每轮需要比较的次数N-i
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    //记录目前能找到的最小元素的下标
                    min=j;
                }
            }
            //将找到的最小值和i位置所在的值进行交换
            if(i!=min){
                int tmp=arr[i];
                arr[i]=arr[min];
                arr[min]=tmp;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
