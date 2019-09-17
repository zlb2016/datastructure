package test;
import java.util.Scanner;
public class course {
    public static  void main(String args[]) {
        int j = 0;//初始化课程没有触发报警的数量
        Scanner scanner = new Scanner(System.in);
        String strm = scanner.nextLine();
        String[] arr = strm.split(" ");//分割第一行的值
        //System.out.println("arr-"+arr[0]);
        int n = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        String nextarr = scanner.nextLine();
        String[] arr1 = nextarr.split(" ");//使用空格分割第二行的数
        //System.out.print("arr1-"+arr1[2]);
        for (int i = 0; i < arr1.length; i++) {
            //System.out.print("arr1-"+arr1[i]);
            if (Integer.parseInt(arr1[i]) < s) {
                j++;
            }
        }
        System.out.println(j);
    }
}
