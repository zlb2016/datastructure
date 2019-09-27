package basic;

public class InsertSort {
    public static void main(String[] args){
        int[] arr={5,3,4,7,2};
        //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for(int i=1;i<arr.length;i++){
            //记录要插入的数据
            int tmp=arr[i];
            //从已经排序的序列最右边开始比较，找到比其小的数
            int j=i;
            while(j>0&&tmp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            //存在比其小的数，插入
            if(j!=i){
                arr[j]=tmp;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
