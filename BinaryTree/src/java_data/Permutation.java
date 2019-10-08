package java_data;

import java.util.Scanner;

public class Permutation {//全排序：1,2,3三个数字的全排序就是{123,132,213,231,321,312}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] a = str.split(",");
        permutation(a,0);
    }
    public static void permutation(String[] data,int index){
        if(index==(data.length-1)){
            for(String temp:data){
                System.out.print(temp+" ");
            }
            System.out.println();
        }else{
            for(int i=index;i<data.length;i++){
                swap(data,index,i);
                permutation(data,index+1);
                swap(data,index,i);
            }
        }
    }
    public static void swap(String[] data,int i,int j){
        String temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
}
